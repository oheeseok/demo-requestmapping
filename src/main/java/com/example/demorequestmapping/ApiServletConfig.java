package com.example.demorequestmapping;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class ApiServletConfig {

//    @Bean
//    public ServletRegistrationBean<DispatcherServlet> apiDispatcherServlet(ApplicationContext context) {
//        DispatcherServlet dispatcherServlet = new DispatcherServlet();
//        dispatcherServlet.setApplicationContext(context);
//
//        ServletRegistrationBean<DispatcherServlet> registrationBean = new ServletRegistrationBean<>(dispatcherServlet, "/api/*");
//        registrationBean.setName("apiServlet");
//        return registrationBean;
//    }

    @Bean
    public ServletRegistrationBean<DispatcherServlet> apiDispatcherServlet() {
        AnnotationConfigWebApplicationContext apiContext = new AnnotationConfigWebApplicationContext();
        apiContext.scan("com.example.api"); // API 컨트롤러만 별도 스캔

        DispatcherServlet dispatcherServlet = new DispatcherServlet(apiContext);
        return new ServletRegistrationBean<>(dispatcherServlet, "/api/*");
    }

}
