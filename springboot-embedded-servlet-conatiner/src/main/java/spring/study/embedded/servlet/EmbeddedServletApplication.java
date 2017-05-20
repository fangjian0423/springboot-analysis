package spring.study.embedded.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by Format on 2017/5/14.
 */
@SpringBootApplication
@ServletComponentScan
public class EmbeddedServletApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(EmbeddedServletApplication.class);
        sa.run(args);
    }

}
