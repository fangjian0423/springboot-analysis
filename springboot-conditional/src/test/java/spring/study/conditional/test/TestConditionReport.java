package spring.study.conditional.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.study.conditional.ConditionalApplication;
import spring.study.conditional.bean.ConditionExpressionBean;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Format on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConditionalApplication.class)
public class TestConditionReport {

    @Autowired
    private ConfigurableListableBeanFactory beanFactory;

    @Test
    public void test01() {
        ConditionEvaluationReport conditionEvaluationReport = beanFactory.getBean("autoConfigurationReport", ConditionEvaluationReport.class);
        Map<String, ConditionEvaluationReport.ConditionAndOutcomes> result = conditionEvaluationReport.getConditionAndOutcomesBySource();
        for(String key : result.keySet()) {
            ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes = result.get(key);
            Iterator<ConditionEvaluationReport.ConditionAndOutcome> iterator = conditionAndOutcomes.iterator();
            while(iterator.hasNext()) {
                ConditionEvaluationReport.ConditionAndOutcome conditionAndOutcome = iterator.next();
                System.out.println(key + " -- " + conditionAndOutcome.getCondition().getClass().getSimpleName() + " -- " + conditionAndOutcome.getOutcome());
            }
        }
    }

    @Test
    public void test02() {
        ConditionExpressionBean bean = beanFactory.getBean(ConditionExpressionBean.class);
        System.out.println(bean);
    }

}
