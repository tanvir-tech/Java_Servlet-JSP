package main.java.controller.Cookies;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCookieServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String[] items = req.getParameterValues("item");

        int i=1;
        for(String item:items){
            Cookie cookie = new Cookie("BuyerName_ProductNo_"+i,item);
            res.addCookie(cookie);

            i++;
            System.out.println("BuyerName_ProductNo_"+i+item);
        }

        res.sendRedirect("/cartShow");

    }

}
