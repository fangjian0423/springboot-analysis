package spring.study.conditional.bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Format on 2017/6/2.
 */
@Conditional(MyCondition.class)
@Component
public class MyConditionalBean {
}


class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println("===== " + Arrays.toString(context.getEnvironment().getActiveProfiles()));
        System.out.println("===== " + context.getEnvironment().getProperty("server.host"));
        return false;
    }
}