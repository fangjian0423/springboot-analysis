package spring.study.beanpostproessor.registrar;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import spring.study.beanpostproessor.bean.EmbeddedService;

/**
 * Created by Format on 2017/6/19.
 */
public class SimpleRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(EmbeddedService.class);
        beanDefinition.getPropertyValues().add("id", "embedded_id_001");
        registry.registerBeanDefinition("beanFromSimpleRegistrar", beanDefinition);
    }
}


