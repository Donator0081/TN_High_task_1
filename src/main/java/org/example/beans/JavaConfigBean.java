package org.example.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigBean {

    @Bean
    public JavaConfigBeanTestClass getBean() {
        return new JavaConfigBeanTestClass();
    }
}
