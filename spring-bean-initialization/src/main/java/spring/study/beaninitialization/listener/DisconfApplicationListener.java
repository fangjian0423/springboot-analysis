package spring.study.beaninitialization.listener;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.*;

/**
 * Created by Format on 2017/6/7.
 */
public class DisconfApplicationListener implements ApplicationListener<ApplicationPreparedEvent>, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
//        ((BeanDefinitionRegistry) applicationContext).removeBeanDefinition("myBeanFactoryPostProcessor");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
