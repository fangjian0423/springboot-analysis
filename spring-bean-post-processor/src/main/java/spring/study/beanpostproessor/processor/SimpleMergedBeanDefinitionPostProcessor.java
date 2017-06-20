package spring.study.beanpostproessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
//@Component
public class SimpleMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

    private String name = "simpleServiceForMerged";

    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
        if(beanName.equals(name)) {
            System.err.println("MergedBeanDefinitionPostProcessor postProcessMergedBeanDefinition: " + beanName + ", " + beanType + ", " + beanDefinition);
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("MergedBeanDefinitionPostProcessor postProcessBeforeInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("MergedBeanDefinitionPostProcessor postProcessAfterInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }
}
