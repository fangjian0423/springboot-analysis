package spring.study.componentprovider.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;
import spring.study.componentprovider.CustomComponentProviderApplication;

/**
 * Created by Format on 2017/6/13.
 */
public class SpringEmbeddedProviderTest {

    private BeanDefinitionRegistry beanDefinitionRegistry;

    @Before
    public void setUp() {
        beanDefinitionRegistry = new DefaultListableBeanFactory();
//        beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
    }

    @Test
    public void testAnnotatedBeanDefinitionReader() {
        AnnotatedBeanDefinitionReader annotatedReader = new AnnotatedBeanDefinitionReader(beanDefinitionRegistry);
        annotatedReader.register(CustomComponentProviderApplication.class);
    }

    @Test
    public void testXmlBeanDefinitionReader() {
        XmlBeanDefinitionReader xmlReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        xmlReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
    }

    @Test
    public void testClassPathBeanDefinitionScanner() {
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanDefinitionRegistry);
        scanner.scan("spring.study.componentprovider.bean");
    }

}
