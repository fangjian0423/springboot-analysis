package spring.study.beaninitialization.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/17.
 */
@Component
public class SimpleFactoryBean implements FactoryBean<RealObject> {

    public SimpleFactoryBean() {
        System.err.println("default SimpleFactoryBean");
    }

    @Override
    public RealObject getObject() throws Exception {
        return new RealObject("id_001", "just a real obj");
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
