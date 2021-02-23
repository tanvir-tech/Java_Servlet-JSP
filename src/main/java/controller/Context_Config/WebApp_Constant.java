package main.java.controller.Context_Config;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebApp_Constant extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();

        ServletContext servletContext = getServletContext();
        String WebApp_Name = servletContext.getInitParameter("webapp_name");

        out.println(WebApp_Name);

    }
}
