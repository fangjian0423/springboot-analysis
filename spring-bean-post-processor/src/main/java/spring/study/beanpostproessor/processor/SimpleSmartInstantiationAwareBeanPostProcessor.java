package spring.study.beanpostproessor.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;
import spring.study.beanpostproessor.bean.EmbeddedService;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * Created by Format on 2017/6/19.
 */
@Component
public class SimpleSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

    private String name = "simpleServiceForS/mart";

    @Override
    public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor predictBeanType: " + beanName + ", " + beanClass);
        }
        return beanClass;
    }

    @Override
    public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor determineCandidateConstructors: " + beanName + ", " + beanClass);
            try {
                return new Constructor[] {
                        beanClass.getConstructor(EmbeddedService.class)
                };
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        if(beanName.equals("referenceA")) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor getEarlyBeanReference: " + beanName + ", " + bean);
            return bean;
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor postProcessBeforeInstantiation: " + beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor postProcessAfterInstantiation: " + beanName + ", " + bean);
            return false;
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor postProcessPropertyValues: " + beanName + ", " + bean + " --- " + pvs + ", " + Arrays.toString(pds));
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor postProcessBeforeInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("SmartInstantiationAwareBeanPostProcessor postProcessAfterInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }
}
