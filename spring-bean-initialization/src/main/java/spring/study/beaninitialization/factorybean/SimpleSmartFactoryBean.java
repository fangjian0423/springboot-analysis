package spring.study.beaninitialization.factorybean;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/17.
 */
@Component
public class SimpleSmartFactoryBean implements SmartFactoryBean<RealObject> {

    public SimpleSmartFactoryBean() {
        System.err.println("default SimpleSmartFactoryBean");
    }

    @Override
    public boolean isPrototype() {
        return false;
    }

    @Override
    public boolean isEagerInit() {
        return true;
    }

    @Override
    public RealObject getObject() throws Exception {
        return new RealObject("id_002", "just a real obj");
    }

    @Override
    public Class<?> getObjectType() {
        return RealObject.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
