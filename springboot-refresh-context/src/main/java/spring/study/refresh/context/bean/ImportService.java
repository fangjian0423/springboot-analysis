package spring.study.refresh.context.bean;

import org.springframework.context.annotation.Bean;

/**
 * Created by Format on 2017/5/4.
 */
public class ImportService {

    @Bean
    public SimpleServiceInImportService simpleServiceInImportService() {
        return new SimpleServiceInImportService();
    }

}
