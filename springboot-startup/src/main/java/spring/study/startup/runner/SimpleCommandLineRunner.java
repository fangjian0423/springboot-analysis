package spring.study.startup.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/2.
 */
@Component
public class SimpleCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("===== SimpleCommandLineRunner");
    }
}
