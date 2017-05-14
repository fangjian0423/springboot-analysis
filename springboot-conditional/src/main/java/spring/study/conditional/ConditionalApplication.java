package spring.study.conditional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import spring.study.conditional.condition.ConditionBeanInImport;

/**
 * Created by Format on 2017/5/11.
 */
@SpringBootApplication
@ImportResource("classpath:import.xml")
@Import(ConditionBeanInImport.class)
public class ConditionalApplication {

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(ConditionalApplication.class);
        sa.run(args);
    }

}
