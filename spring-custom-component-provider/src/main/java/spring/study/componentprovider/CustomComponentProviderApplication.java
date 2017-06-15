package spring.study.componentprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import other.pkg.OtherBean;
import spring.study.componentprovider.annotation.EnableConsumer;

/**
 * Created by Format on 2017/6/10.
 */
@SpringBootApplication
@EnableConsumer
public class CustomComponentProviderApplication {

    public static void main(String[] args) {



        SpringApplication.run(
                new Object[] {
                        CustomComponentProviderApplication.class
                        , new ClassPathResource("beans.xml")
                        , OtherBean.class.getPackage()
//                        , String.valueOf("other.pkg")
                }
                , args);


//        SpringApplication.run(CustomComponentProviderApplication.class, args);
//        SpringApplication sa = new SpringApplication();
//        sa.run(CustomComponentProviderApplication.class, args);
    }

}
