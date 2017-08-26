package spring.study.mytest.controller;

import me.format.springboot.log.annotation.Log;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Format on 2017/8/26.
 */
@RestController
public class TestController {

    @Log
    @RequestMapping("/test")
    public String test() {
        return "only test";
    }

}
