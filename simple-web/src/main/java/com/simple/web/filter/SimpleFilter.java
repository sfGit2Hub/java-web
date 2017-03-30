package com.simple.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by SF on 2017/3/30.
 */
@WebFilter(value = "/simpleFilter", urlPatterns = "/simple")
public class SimpleFilter extends HttpServlet implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        response.setCharacterEncoding("utf-8");
        if (session.getAttribute("user") == null) {
            PrintWriter out = response.getWriter();
            out.print("<script>alert('请登录！');location.href='../login1.htm'</script>");
        } else {
//        pass the request along the filter chain
            chain.doFilter(request, response);
        }
    }
}
