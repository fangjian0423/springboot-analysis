package spring.study.beanpostproessor.processor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Format on 2017/6/18.
 */
//@Component
public class SimpleInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    private String name = "simpleServiceImpl";

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            try {
                System.err.println("InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation: " + beanName);
//                ProxyFactory proxyFactory = new ProxyFactory();
//                proxyFactory.setInterfaces(beanClass.getInterfaces());
//                proxyFactory.addAdvice(new MyMethodInterceptor());
//                proxyFactory.setTarget(beanClass.newInstance());
//                return proxyFactory.getProxy();
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("InstantiationAwareBeanPostProcessor postProcessAfterInstantiation: " + beanName + ", " + bean);
            return false;
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("InstantiationAwareBeanPostProcessor postProcessPropertyValues: " + beanName + ", " + bean + " --- " + pvs + ", " + Arrays.toString(pds));
//            return null;
        } else if(beanName.equals("beanFromSimpleRegistrar")) {
            pvs.getPropertyValue("id").setConvertedValue("embedded_id_002");
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("InstantiationAwareBeanPostProcessor postProcessBeforeInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals(name)) {
            System.err.println("InstantiationAwareBeanPostProcessor postProcessAfterInitialization: " + beanName + ", " + bean);
        }
        return bean;
    }

    class MyMethodInterceptor implements MethodInterceptor {
        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            System.out.println("====[proxy] start: " + new Date());
            Object result = invocation.proceed();
            System.out.println("====[proxy] end: " + new Date());
            return result;
        }
    }

}
