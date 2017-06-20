package spring.study.beanpostproessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import spring.study.beanpostproessor.registrar.SimpleRegistrar;

/**
 * Created by Format on 2017/6/18.
 */
@SpringBootApplication
@Import(SimpleRegistrar.class)
public class BeanPostProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeanPostProcessorApplication.class, args);
    }
}
