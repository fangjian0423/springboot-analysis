package spring.study.embedded.servlet.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionEvaluationReport;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by Format on 2017/5/15.
 */
@RestController
public class TestController {

    @Autowired
    private BeanFactory beanFactory;

    @RequestMapping("/custom") // 优先级没有servlet高
    public String custom() {
        return "custom method receive by TestController";
    }

    @RequestMapping("/simple") // 优先级没有servlet高
    public String simple() {
        return "simple method receive by TestController";
    }

    @RequestMapping("/test")
    public String test() {
        return beanFactory.getBean(WebMvcConfigurationSupport.class).toString();
    }

    @RequestMapping("/conditional")
    public String conditonal() {
        StringBuilder sb = new StringBuilder();
        ConditionEvaluationReport conditionEvaluationReport = beanFactory.getBean("autoConfigurationReport", ConditionEvaluationReport.class);
        Map<String, ConditionEvaluationReport.ConditionAndOutcomes> result = conditionEvaluationReport.getConditionAndOutcomesBySource();
        for(String key : result.keySet()) {
            ConditionEvaluationReport.ConditionAndOutcomes conditionAndOutcomes = result.get(key);
            Iterator<ConditionEvaluationReport.ConditionAndOutcome> iterator = conditionAndOutcomes.iterator();
            while(iterator.hasNext()) {
                ConditionEvaluationReport.ConditionAndOutcome conditionAndOutcome = iterator.next();
                sb.append(key + " -- " + conditionAndOutcome.getCondition().getClass().getSimpleName() + " -- " + conditionAndOutcome.getOutcome() + "<br/>");
            }
        }
        return sb.toString();
    }

}
