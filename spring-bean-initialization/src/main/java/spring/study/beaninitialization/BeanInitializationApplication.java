package spring.study.beaninitialization;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.study.beaninitialization.utils.ApplicationUtils;

/**
 * Created by Format on 2017/6/16.
 */
@SpringBootApplication
public class BeanInitializationApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(BeanInitializationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("======!!!!!!: " + ApplicationUtils.getProperty("test"));
    }
}
