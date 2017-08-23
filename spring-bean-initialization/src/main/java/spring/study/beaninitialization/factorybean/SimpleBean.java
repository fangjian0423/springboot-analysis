package spring.study.beaninitialization.factorybean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/17.
 */
@Getter
@Setter
@ToString
@Component
public class SimpleBean {

    public SimpleBean() {
        System.err.println("default SimpleBean");
    }

    public SimpleBean(String id, String desc) {
        this.id = id;
        this.desc = desc;
        System.err.println("construct SimpleBean: " + id);
    }

    private String id;
    private String desc;
}
