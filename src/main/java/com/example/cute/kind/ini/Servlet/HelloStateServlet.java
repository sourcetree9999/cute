package com.example.cute.kind.ini.Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author gu
 * @date 2022/6/17
 */
@WebServlet(urlPatterns = "/country/*", loadOnStartup = 1)
public class HelloStateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        System.out.println("HelloCountryServlet");
        doGet(request,response);
        System.out.println("HelloCountryServlet");

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello India!</h3>");
    }
}
