package spring.study.beanpostproessor.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


/**
 * Created by Format on 2017/6/21.
 */
//@Component
public class BeanForAutowired {

    public BeanForAutowired() {
        System.err.println("constructor BeanForAutowired");
    }

    @Autowired
    private AutowiredNestedBean nestedBean;

    @Value("${test.prop}")
    private String test;

}


//@Component
class AutowiredNestedBean {
    public AutowiredNestedBean() {
        System.err.println("constructor AutowiredNestedBean");
    }
}