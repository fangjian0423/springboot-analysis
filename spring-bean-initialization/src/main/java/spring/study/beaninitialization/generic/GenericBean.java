package spring.study.beaninitialization.generic;

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
public class GenericBean {

    private String from;

}
