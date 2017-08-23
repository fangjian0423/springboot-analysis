package spring.study.beaninitialization.factorybean;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Format on 2017/6/17.
 */
public class FactoryDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    private BeanNameGenerator beanNameGenerator = new AnnotationBeanNameGenerator();
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AnnotatedGenericBeanDefinition bd1 = new AnnotatedGenericBeanDefinition(SimpleInterface.class);
        bd1.setAbstract(true);
        AnnotatedGenericBeanDefinition bd2 = new AnnotatedGenericBeanDefinition(AbstractObj.class);
        bd2.setAbstract(true);
        registry.registerBeanDefinition(beanNameGenerator.generateBeanName(bd1, registry), bd1);
        registry.registerBeanDefinition(beanNameGenerator.generateBeanName(bd2, registry), bd2);
    }
}
