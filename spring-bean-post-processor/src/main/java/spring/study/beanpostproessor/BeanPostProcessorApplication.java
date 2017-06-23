package spring.study.beanpostproessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.beanvalidation.BeanValidationPostProcessor;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import spring.study.beanpostproessor.registrar.SimpleRegistrar;

/**
 * Created by Format on 2017/6/18.
 */
@SpringBootApplication
@Import(SimpleRegistrar.class)
@EnableAspectJAutoProxy
@EnableScheduling
@EnableAsync
public class BeanPostProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeanPostProcessorApplication.class, args);
    }

    @Bean
    public BeanPostProcessor beanValidationPostProcessor() {
        BeanValidationPostProcessor processor = new BeanValidationPostProcessor();
        processor.setAfterInitialization(true);
        return processor;
    }

    @Bean
    public BeanPostProcessor methodValidationPostProcessor() {
        MethodValidationPostProcessor processor = new MethodValidationPostProcessor();
        return processor;
    }

}
