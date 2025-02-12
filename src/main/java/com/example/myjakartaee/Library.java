package com.example.myjakartaee;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.*;


public class Library extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try(PrintWriter out = response.getWriter();
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title FROM books")) {

            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Library</title></head><body>");
            out.println("<h1>Books:</h1>");
            while (rs.next()) {
                out.println("<p>" + rs.getString("title") + "</p>");
            }
            out.println("</body></html>");

        } catch (SQLException e) {
            throw new RuntimeException("Database error: " + e.getMessage(), e);
        }

    }
}
