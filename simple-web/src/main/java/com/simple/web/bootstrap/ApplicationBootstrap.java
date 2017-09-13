package com.simple.web.bootstrap;

import com.simple.web.config.RootContextConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by SF on 2017/9/10.
 */
@SuppressWarnings("unused")
@Order(1)
public class ApplicationBootstrap implements WebApplicationInitializer{
    private static final Logger log = LogManager.getLogger();

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.getServletRegistration("default").addMapping("/static/*");

        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootContextConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

    }
}
