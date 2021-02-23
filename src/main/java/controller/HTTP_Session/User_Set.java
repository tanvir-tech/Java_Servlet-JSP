package main.java.controller.HTTP_Session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class User_Set extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String name = req.getParameter("name");
        //String pass = req.getParameter("pass");

        HttpSession session = req.getSession();
        session.setAttribute("name",name);

        res.sendRedirect("userName");
    }
}
