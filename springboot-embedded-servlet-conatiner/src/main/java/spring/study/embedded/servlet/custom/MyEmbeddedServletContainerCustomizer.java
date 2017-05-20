package spring.study.embedded.servlet.custom;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/18.
 */
@Component
public class MyEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setContextPath("/format");
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));

    }
}
