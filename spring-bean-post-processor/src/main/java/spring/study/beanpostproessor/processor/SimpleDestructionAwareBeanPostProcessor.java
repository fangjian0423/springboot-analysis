package spring.study.beanpostproessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
//@Component
public class SimpleDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor {

    private String name = "simpleServiceForDestroy";

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if(beanName != null && beanName.equals(name)) {
            System.err.println("DestructionAwareBeanPostProcessor postProcessBeforeDestruction: " + beanName + ", " + bean);
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("DestructionAwareBeanPostProcessor postProcessBeforeInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("DestructionAwareBeanPostProcessor postProcessAfterInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

}
