package spring.study.stop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.study.stop.service.DBService;

/**
 * Created by Format on 2017/6/26.
 */
@RestController
public class StopController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private DBService dbService;

    @RequestMapping("/stop")
    public String stop() {
        SpringApplication.exit(applicationContext);
        return "ok";
    }

    @RequestMapping("/save")
    public String save() {
        dbService.save(1000000);
        return "ok";
    }

}
