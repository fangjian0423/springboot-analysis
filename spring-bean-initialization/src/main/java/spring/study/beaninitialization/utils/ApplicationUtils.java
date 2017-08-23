package spring.study.beaninitialization.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/7/27.
 */
@Component
public class ApplicationUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    public static Object getProperty(String key) {
        return applicationContext.getEnvironment().getProperty(key);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }
}
