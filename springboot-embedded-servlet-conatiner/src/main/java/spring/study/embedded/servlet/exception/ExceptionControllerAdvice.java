package spring.study.embedded.servlet.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Format on 2017/5/20.
 */
//@ControllerAdvice // 启动的话。错误页都会被这里截获，而不走whitelabel error page
public class ExceptionControllerAdvice {

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Map<String, Object> ajaxError(Throwable error, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        map.put("error", error.getMessage());
        map.put("result", "error");
        return map;
    }

}