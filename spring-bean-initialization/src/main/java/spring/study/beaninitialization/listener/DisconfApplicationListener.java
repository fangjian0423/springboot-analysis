package uyun.whale.common.config;

import org.springframework.beans.BeansException;
import org.springframework.context.*;

/**
 * Created by Format on 2017/6/7.
 */
public class DisconfApplicationListener implements ApplicationListener<ApplicationEvent>, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event.getClass().getName().equals("org.springframework.boot.context.event.ApplicationPreparedEvent")) {
            ((ConfigurableApplicationContext) applicationContext).addBeanFactoryPostProcessor(new DisconfBeanFactoryPostProcessor(applicationContext));
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
