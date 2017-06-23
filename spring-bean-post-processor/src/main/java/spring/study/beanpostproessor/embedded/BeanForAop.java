package spring.study.beanpostproessor.embedded;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Format on 2017/6/22.
 */
@Component
public class BeanForAop {

    public void test() {
        System.err.println("bean for aop");
    }

}

