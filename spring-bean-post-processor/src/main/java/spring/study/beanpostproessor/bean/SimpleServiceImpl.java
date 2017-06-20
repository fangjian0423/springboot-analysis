package spring.study.beanpostproessor.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/18.
 */
@Getter
@Setter
@ToString
@Component
public class SimpleServiceImpl implements ISimpleService {
//    @Autowired
    private EmbeddedService embeddedService;
//    public SimpleServiceImpl() { }
    @Autowired
    public SimpleServiceImpl(EmbeddedService embeddedService) {
        this.embeddedService = embeddedService;
    }
    @Override
    public void doSomething(Object arg) {
        System.out.println("----- doSomething with: " + arg);
    }
}
