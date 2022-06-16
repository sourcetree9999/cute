package com.example.cute.kind.ini.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author gu
 * @date 2022/6/16
 */
@Component
@Order(1)

public class TransactionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(
                "Starting a transaction for req : {}");

        chain.doFilter(request, response);
        System.out.println(
                "Committing a transaction for req : {}");
    }
}
