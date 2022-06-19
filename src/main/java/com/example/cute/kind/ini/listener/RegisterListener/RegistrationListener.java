package com.example.cute.kind.ini.listener.RegisterListener;

import com.example.cute.kind.ini.listener.ExampleServletContextListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;

/**
 * @author gu
 * @date 2022/6/19
 */
@Configuration
public class RegistrationListener {

    @Bean
    ServletListenerRegistrationBean<ServletContextListener> servletListener() {
        ServletListenerRegistrationBean<ServletContextListener> sben = new ServletListenerRegistrationBean<>();
        sben.setListener(new ExampleServletContextListener());
        return sben;
    }
}
