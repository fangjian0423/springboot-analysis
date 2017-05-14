package spring.study.conditional.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/12.
 */
@ConditionalOnExpression("'${server.host}' == 'localhost'")
@Component
public class ConditionExpressionBean {
}
