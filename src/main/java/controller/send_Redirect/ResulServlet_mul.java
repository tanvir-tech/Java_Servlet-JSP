package main.java.controller.send_Redirect;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResulServlet_mul extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int mul = Integer.parseInt(req.getParameter("mul"));

        PrintWriter out = res.getWriter();
        out.println("Multiplication result is = "+mul);
    }
}
