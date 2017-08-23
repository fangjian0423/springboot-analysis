package spring.study.beaninitialization.other;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Format on 2017/6/17.
 */
@Configuration
@Import(FactoryDefinitionRegistrar.class)
public class FactoryBeanConfigurationClass {
}
