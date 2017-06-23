package spring.study.beanpostproessor.embedded;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Format on 2017/6/22.
 */
@Component
public class BeanForSchedule {

    @Scheduled(cron = "0/5 * * * * *")
    public void test() {
        System.err.println(new Date() + " schedule by5 * * * * *");
    }

}

