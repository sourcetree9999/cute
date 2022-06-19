package com.example.cute.kind.ini.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author gu
 * @date 2022/6/19
 */
@WebFilter(urlPatterns = "/aaa/*")
public class TestAnnFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(
                "Starting a TestAnnFilterTestAnnFilter for req : {}");

        chain.doFilter(request, response);
        System.out.println(
                "Committing a TestAnnFilterTestAnnFilter for req : {}");
    }
}
