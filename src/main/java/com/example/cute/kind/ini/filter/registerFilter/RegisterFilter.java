package com.example.cute.kind.ini.filter.registerFilter;

import com.example.cute.kind.ini.filter.RequestResponseLoggingFilter;
import com.example.cute.kind.ini.filter.TransactionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author gu
 * @date 2022/6/16
 */
public class RegisterFilter {

    @Bean
    public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilter(){
        FilterRegistrationBean<RequestResponseLoggingFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new RequestResponseLoggingFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);

        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean<TransactionFilter> transa1ctionFilter(){
        FilterRegistrationBean<TransactionFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new TransactionFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);

        return registrationBean;
    }
}
