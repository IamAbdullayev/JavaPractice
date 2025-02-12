package com.example.myjakartaee;

import java.io.*;
import jakarta.servlet.http.*;


public class deleteCookiesServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie = new Cookie("id", "");

        cookie.setMaxAge(0);

        response.addCookie(cookie);
    }
}
