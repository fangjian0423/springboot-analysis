package spring.study.startup.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/2.
 */
@Component
public class SimpleApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===== SimpleApplicationRunner");;
    }
}
