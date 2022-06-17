package com.example.cute.kind.ini.Servlet.registerServlet;

import com.example.cute.kind.ini.Servlet.HelloCountryServlet;
import com.example.cute.kind.ini.Servlet.HelloStateServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;

/**
 * @author gu
 * @date 2022/6/17
 */
@Configuration
public class ServletRegistration {
    @Bean
    public ServletRegistrationBean<HttpServlet> countryServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new HelloCountryServlet());
        servRegBean.addUrlMappings("/country/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }

    @Bean
    public ServletRegistrationBean<HttpServlet> stateServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new HelloStateServlet());
        servRegBean.addUrlMappings("/state/*");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}