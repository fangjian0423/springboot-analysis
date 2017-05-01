package spring.study.startup.bean;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/1.
 */
@Getter
@Setter
@ToString
@Component
@AllArgsConstructor
@NoArgsConstructor
public class SimpleBean {

    private String id;
    private String name;

}
