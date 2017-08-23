package spring.study.beaninitialization.factorybean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Format on 2017/6/17.
 */
@Getter
@Setter
@ToString
public class RealObject {

    public RealObject(String id, String desc) {
        this.id = id;
        this.desc = desc;
        System.err.println("construct RealObject: " + id);
    }

    private String id;
    private String desc;

}
