package com.example.myjakartaee;

import java.io.*;
import jakarta.servlet.http.*;


public class getCookiesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("<h1>" + cookie.getName() + " = " + cookie.getValue() + "</h1>");
            }
        }
        out.println("</body></html>");

    }
}
