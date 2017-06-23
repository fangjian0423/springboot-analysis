package spring.study.beanpostproessor.embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/22.
 */
//@Component
public class BeanForRequired {

    public BeanForRequired() {
        System.err.println("constructor BeanForRequired");
    }

    private RequiredNestedBean nestedBean;

    @Required
    public void setNestedBean(RequiredNestedBean nestedBean) {
        this.nestedBean = nestedBean;
    }
}


//@Component
class RequiredNestedBean {
    public RequiredNestedBean() {
        System.err.println("constructor RequiredNestedBean");
    }
}