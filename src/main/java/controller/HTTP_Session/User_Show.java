package main.java.controller.HTTP_Session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class User_Show extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");

        PrintWriter out = res.getWriter();
        out.println("Your name is "+name);
    }
}
