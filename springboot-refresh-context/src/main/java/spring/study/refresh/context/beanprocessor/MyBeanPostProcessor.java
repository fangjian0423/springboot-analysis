package spring.study.refresh.context.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/8.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("------ MyBeanPostProcessor construct");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String arg1)
            throws BeansException {
        System.out.println("------ MyBeanPostProcessor before initialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String arg1)
            throws BeansException {
        System.out.println("------ MyBeanPostProcessor after initialization");
        return bean;
    }

}
