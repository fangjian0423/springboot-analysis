package spring.study.beanpostproessor.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
@Component
public class SimpleServiceForSmart {
    private EmbeddedService embeddedService;
    public SimpleServiceForSmart() {
        System.err.println("SimpleServiceForSmart constructor default");
    }
    public SimpleServiceForSmart(EmbeddedService embeddedService) {
        this.embeddedService = embeddedService;
        System.err.println("SimpleServiceForSmart constructor embeddedService: " + embeddedService);
    }
}
