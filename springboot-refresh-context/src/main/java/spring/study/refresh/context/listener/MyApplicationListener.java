package spring.study.refresh.context.listener;

import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import spring.study.refresh.context.bean.SimpleBeanInListener;

/**
 * Created by Format on 2017/5/10.
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ContextRefreshedEvent) {
            ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
            if(applicationContext instanceof AnnotationConfigEmbeddedWebApplicationContext) {
                ((AnnotationConfigEmbeddedWebApplicationContext) applicationContext).getBeanFactory().registerSingleton("simpleBeanInListener", new SimpleBeanInListener());
            }

        }
    }
}
