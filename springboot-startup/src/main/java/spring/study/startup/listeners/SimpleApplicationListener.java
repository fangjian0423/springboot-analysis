package spring.study.startup.listeners;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Format on 2017/5/1.
 */
public class SimpleApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof ApplicationStartedEvent) {
            System.out.println("===== custom started event in initializer");
        } else if(event instanceof ApplicationReadyEvent) {
            System.out.println("===== custom ready event in initializer");
        }
    }
}