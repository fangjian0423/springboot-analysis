package spring.study.componentprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.study.componentprovider.annotation.EnableConsumer;

/**
 * Created by Format on 2017/6/10.
 */
@SpringBootApplication
@EnableConsumer
public class CustomComponentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomComponentProviderApplication.class, args);
    }

}
