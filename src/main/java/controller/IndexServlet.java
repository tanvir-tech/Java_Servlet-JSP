package main.java.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        System.out.println("Index called");
    }
}
