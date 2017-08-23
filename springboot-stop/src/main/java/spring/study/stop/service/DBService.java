package spring.study.stop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Format on 2017/7/1.
 */
@Service
public class DBService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(int num) {
        Random random = new Random();
        for(int i = 0; i < num; i ++) {
            String name = "format-" + (i + 1);
            int age = i + 1;
            int rdm = random.nextInt(10);
            jdbcTemplate.batchUpdate("insert into t_users2(name, age, num) values(\"" + name + "\", " + age + ", " + rdm + ")");
        }
    }

}
