package main.java.controller.Context_Config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet_Constant  extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();

        ServletConfig servletConfig = getServletConfig();
        String Servlet_value = servletConfig.getInitParameter("servletName");

        out.println(Servlet_value);

    }
}
