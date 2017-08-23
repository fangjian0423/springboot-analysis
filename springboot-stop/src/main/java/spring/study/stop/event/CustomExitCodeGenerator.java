package spring.study.stop.event;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/6/26.
 */
@Component
public class CustomExitCodeGenerator implements ExitCodeGenerator {
    @Override
    public int getExitCode() {
        return 999;
    }
}
