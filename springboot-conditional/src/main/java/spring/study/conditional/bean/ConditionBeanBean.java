package spring.study.conditional.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/12.
 */
@ConditionalOnBean(value = FreeMarkerAutoConfiguration.class)
@Component
public class ConditionBeanBean {
}
