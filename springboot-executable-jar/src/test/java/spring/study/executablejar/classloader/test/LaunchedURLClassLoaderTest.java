package spring.study.executablejar.classloader.test;

import org.junit.Test;
import org.springframework.boot.loader.LaunchedURLClassLoader;
import org.springframework.boot.loader.jar.JarFile;

import java.net.URL;

/**
 * Created by Format on 2017/5/30.
 */
public class LaunchedURLClassLoaderTest {

    @Test
    public void test() {
        try {
            JarFile.registerUrlProtocolHandler();
            LaunchedURLClassLoader classLoader = new LaunchedURLClassLoader(
                    new URL[] {
                            new URL("jar:file:/Users/fangjian/Develop/gitrepository/springboot-analysis/springboot-executable-jar/target/executable-jar-1.0-SNAPSHOT.jar!/lib/spring-boot-loader-1.3.5.RELEASE.jar!/")
                            , new URL("jar:file:/Users/fangjian/Develop/gitrepository/springboot-analysis/springboot-executable-jar/target/executable-jar-1.0-SNAPSHOT.jar!/lib/spring-boot-1.3.5.RELEASE.jar!/")
                    },
                    LaunchedURLClassLoaderTest.class.getClassLoader());

//            classLoader.loadClass("org.springframework.boot.loader.JarLauncher");
//            classLoader.loadClass("org.springframework.boot.SpringApplication");
            classLoader.loadClass("org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
