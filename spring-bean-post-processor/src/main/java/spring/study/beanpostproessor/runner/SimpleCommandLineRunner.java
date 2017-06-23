package spring.study.beanpostproessor.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import spring.study.beanpostproessor.embedded.BeanForAop;
import spring.study.beanpostproessor.embedded.BeanForAsync;
import spring.study.beanpostproessor.embedded.BeanForMethodValidation;

/**
 * Created by Format on 2017/6/22.
 */
@Component
public class SimpleCommandLineRunner implements CommandLineRunner {
    @Autowired
    private BeanForAop beanForAop;
    @Autowired
    private BeanForMethodValidation beanForMethodValidation;
    @Autowired
    private BeanForAsync beanForAsync;
    @Autowired
    private ApplicationContext applicationContext;
    @Override
    public void run(String... args) throws Exception {
        beanForAop.test();
        beanForMethodValidation.validate("11", 15);
        System.out.println("start async");
        beanForAsync.async();
        System.out.println("end async");
    }
}
