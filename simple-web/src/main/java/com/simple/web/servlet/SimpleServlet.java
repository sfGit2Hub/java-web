package com.simple.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 */
@WebServlet(name = "simpleServlet", urlPatterns = "/simple")
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("var", "This is attribute!");
        System.out.println("========= AuthType:" + request.getAuthType() + "==========");
        Map parameter = request.getParameterMap();
        parameter.forEach((key,value) -> System.out.println("parameter name:" + key + "-" + value));

        request.getRequestDispatcher("/WEB-INF/jsp/simple.jsp")
                .forward(request, response);
//        super.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
