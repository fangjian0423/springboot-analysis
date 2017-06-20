package spring.study.beanpostproessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/18.
 */
//@Component
public class SimpleBeanPostProcessor implements BeanPostProcessor {

    private String name = "simpleServiceImpl";

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("BeanPostProcessor postProcessBeforeInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("BeanPostProcessor postProcessAfterInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }
}
