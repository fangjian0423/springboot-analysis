package spring.study.beanpostproessor.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
@Component
public class SimpleServiceForDestroy {
    public SimpleServiceForDestroy() {
        System.err.println("SimpleServiceForDestroy constructor default");
    }
}
