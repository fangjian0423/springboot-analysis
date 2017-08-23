package spring.study.stop.event;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Format on 2017/6/27.
 */
public class ExitListener implements ApplicationListener<ExitCodeEvent> {
    @Override
    public void onApplicationEvent(ExitCodeEvent event) {
        System.out.println("exit...");
    }
}
