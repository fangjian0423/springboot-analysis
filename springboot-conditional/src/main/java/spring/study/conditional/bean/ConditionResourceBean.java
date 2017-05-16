package spring.study.conditional.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/16.
 */
@ConditionalOnResource(resources = "mybatis.xml")
@Component
public class ConditionResourceBean {
}
