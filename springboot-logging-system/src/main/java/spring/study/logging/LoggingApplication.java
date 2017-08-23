package spring.study.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Format on 2017/8/18.
 */
@SpringBootApplication
public class LoggingApplication {

    Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LoggingApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                logger.info("runner execute");
            }
        };
    }

}
