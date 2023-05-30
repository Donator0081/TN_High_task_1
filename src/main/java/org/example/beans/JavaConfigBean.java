package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.example.beans")
public class JavaConfigBean {

    @Bean
    public JavaConfigBeanTestClass getBean() {
        return new JavaConfigBeanTestClass();
    }
}
