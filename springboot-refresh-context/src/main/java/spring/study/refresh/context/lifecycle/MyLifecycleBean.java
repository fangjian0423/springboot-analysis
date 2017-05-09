package spring.study.refresh.context.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/8.
 */
@Component
public class MyLifecycleBean implements SmartLifecycle {

    private boolean running = false;

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("------ my lifecycle bean stop callback");
    }

    @Override
    public void start() {
        running = true;
        System.out.println("------ my lifecycle bean start");
    }

    @Override
    public void stop() {
        running = false;
        System.out.println("------ my lifecycle bean stop");
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public int getPhase() {
        return 0;
    }
}
