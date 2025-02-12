package com.example.myjakartaee;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


//        response.sendRedirect("/hello-servlet-jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/helloJSP.jsp");
//        try {
//            dispatcher.forward(request, response);
//        }
//        catch (ServletException e) {
//            System.out.println("Something went wrong...");
//        }


        HttpSession session = request.getSession();

        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        session.setAttribute("counter", ++counter);

        String user = request.getParameter("user");
        String userSave = (String) session.getAttribute("user");
        if (userSave == null) {
            userSave = user;
        }
        session.setAttribute("user", userSave);

        String name = request.getParameter("name");
        int quantity;
        if (request.getParameter("quantity") != null) {
            quantity = Integer.parseInt(request.getParameter("quantity"));
        } else {
            quantity = 0;
        }
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();

            cart.setQuantity(quantity);
            cart.setName(name);
        }
        session.setAttribute("cart", cart);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + userSave + "! You have entered the page: " + counter + "</h1>");
        out.println("<div>You have " + cart.getQuantity() + " " + cart.getName() + "</div>");
        out.println("</body></html>");

        try {
            getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
        }
        catch (ServletException e) {
            System.out.println("Something went wrong..");
        }
    }

    public void destroy() {
    }
}