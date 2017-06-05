package spring.study.factories.loader.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.study.factories.loader.SpringFactoriesApplication;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Format on 2017/6/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringFactoriesApplication.class)
public class LoadTest {

    @Test
    public void test01() {
        try {
            Enumeration<URL> files = this.getClass().getClassLoader().getResources(SpringFactoriesLoader.FACTORIES_RESOURCE_LOCATION);

            while(files.hasMoreElements()) {
                System.out.println("=== " + files.nextElement());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        List<String> classes = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, this.getClass().getClassLoader());
        classes.forEach(clazz -> {
            System.out.println("==== " + clazz);
        });
    }

}
