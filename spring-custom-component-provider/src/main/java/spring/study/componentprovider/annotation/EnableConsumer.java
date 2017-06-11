package spring.study.componentprovider.annotation;

import org.springframework.context.annotation.Import;
import spring.study.componentprovider.spring.ConsumerRegistrar;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Format on 2017/6/10.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(ConsumerRegistrar.class)
public @interface EnableConsumer {

}
