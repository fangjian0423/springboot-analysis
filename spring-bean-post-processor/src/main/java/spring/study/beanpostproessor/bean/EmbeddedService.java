package spring.study.beanpostproessor.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/19.
 */
//@Component
@Setter
@Getter
@ToString
public class EmbeddedService {
    public EmbeddedService() {
        System.err.println("constructor EmbeddedService");
    }
    private String id;
}
