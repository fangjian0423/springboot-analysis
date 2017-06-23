package spring.study.beanpostproessor.embedded;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by Format on 2017/6/21.
 */
//@Component
public class BeanForCommon {

    public BeanForCommon() {
        System.err.println("constructor BeanForCommon");
    }

    @Resource
    private CommonNestedBean nestedBean;

    @PostConstruct
    public void init() {
        System.err.println("BeanForCommon PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.err.println("BeanForCommon PreDestroy");
    }

}


//@Component
class CommonNestedBean {
    public CommonNestedBean() {
        System.err.println("constructor CommonNestedBean");
    }
}