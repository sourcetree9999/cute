package com.example.cute.kind.ini.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author gu
 * @date 2022/6/19
 */
@WebListener
public class TestAnnListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("servlet-context-attr", "test");
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println(
                "TestAnnListener triggered - ContextListener.");
    }
}
