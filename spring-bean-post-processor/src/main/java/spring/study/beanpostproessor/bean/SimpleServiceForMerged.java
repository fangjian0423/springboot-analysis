package spring.study.beanpostproessor.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
@Component
public class SimpleServiceForMerged {
    public SimpleServiceForMerged() {
        System.err.println("SimpleServiceForMerged constructor default");
    }
}
