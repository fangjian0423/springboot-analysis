package spring.study.beanpostproessor.embedded;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;

/**
 * Created by Format on 2017/6/23.
 */
@Component
@Validated
public class BeanForMethodValidation {

    public void validate(@NotEmpty String name, @Min(10) int age) {
        System.err.println("validate, name: " + name + ", age: " + age);
    }

}
