package spring.study.embedded.servlet.initializer;

import org.springframework.boot.context.embedded.ServletContextInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Format on 2017/5/18.
 */
public class MyServletContextInitializer implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        servletContext.addFilter();
//        servletContext.addListener();
//        servletContext.addServlet()
    }
}
