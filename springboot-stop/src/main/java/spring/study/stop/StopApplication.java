package spring.study.stop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.study.stop.event.ExitListener;

/**
 * Created by Format on 2017/6/26.
 */
@SpringBootApplication
public class StopApplication {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(StopApplication.class);
        sa.addListeners(new ExitListener());
        sa.run(args);
    }
}
