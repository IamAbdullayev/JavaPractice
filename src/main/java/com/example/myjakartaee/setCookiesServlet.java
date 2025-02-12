package com.example.myjakartaee;

import java.io.*;
import jakarta.servlet.http.*;


public class setCookiesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie1 = new Cookie("id", "#123");
        Cookie cookie2 = new Cookie("name", "Ramazan");

        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie1);
        response.addCookie(cookie2);

    }

}


