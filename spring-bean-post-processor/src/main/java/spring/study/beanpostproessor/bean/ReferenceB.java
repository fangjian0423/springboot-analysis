package spring.study.beanpostproessor.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/20.
 */
@Component
public class ReferenceB {
    private ReferenceA referenceA;
    @Autowired
    public ReferenceB(ReferenceA referenceA) {
        this.referenceA = referenceA;
    }
}
