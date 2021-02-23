package main.java.controller.Cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShowCookieServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Cookie[] cookies = req.getCookies();

        PrintWriter out = res.getWriter();

        for(Cookie c :cookies){
            //System.out.println(c.getName()+"->"+c.getValue());
            out.println(c.getName()+"->"+c.getValue());

        }

    }
}
