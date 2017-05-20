package spring.study.embedded.servlet.listener;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Format on 2017/5/15.
 */
public class CustomWebListener implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        // 可以做一些参数的监测，如果不合格的话，直接stop
//        event.getEmbeddedServletContainer().stop();
    }
}
