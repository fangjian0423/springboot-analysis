package spring.study.embedded.servlet.servlet;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Format on 2017/5/15.
 */
@Configuration
public class CustomServletRegistrationBean {

    @Bean // 注册Servlet到Servlet容器中
    public ServletRegistrationBean customServlet() {
        return new ServletRegistrationBean(new CustomServlet(), "/custom");
    }


    private static class CustomServlet extends HttpServlet {
        @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.getWriter().write("receive by CustomServlet");
//            resp.sendRedirect("https://www.github.com");
//            super.service(req, resp);
        }
    }

}
