package spring.study.property.loader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Format on 2017/6/3.
 */
@SpringBootApplication
public class SpringPropertyLoaderApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication();
        sa.run(SpringPropertyLoaderApplication.class, args);
    }

}
