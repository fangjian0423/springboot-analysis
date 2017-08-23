package spring.study.beaninitialization.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/17.
 */
@Component
public class TestCommandLineRunner implements CommandLineRunner {
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        System.err.println("TestCommandLineRunner start");
        applicationContext.getBean("simpleFactoryBean");
        applicationContext.getBean("simpleSmartFactoryBean");
        int a = 1;
    }
}
