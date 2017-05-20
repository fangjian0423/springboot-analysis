package spring.study.embedded.servlet.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Format on 2017/5/15.
 */
@Controller
public class SimpleController {

    @RequestMapping("/myView")
    public String custom() {
        return "1";
    }

    @RequestMapping("/myError")
    public String simple() {
        throw new RuntimeException("my exception");
    }

    @RequestMapping("/error")
    @ResponseBody
    public String error() {
        return "my error";
    }

}
