package spring.study.refresh.context;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import spring.study.refresh.context.bean.ImportService;

/**
 * Created by Format on 2017/5/3.
 */
@SpringBootApplication
@Import(ImportService.class)
@PropertySources(@PropertySource("classpath:simple.properties"))
@ImportResource("classpath:import.xml")
public class RefreshContextApplication {
    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(RefreshContextApplication.class);
        sa.run(args);
    }
}
