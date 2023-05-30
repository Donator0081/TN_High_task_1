package org.example.beans;

import jakarta.annotation.PostConstruct;

public class JavaConfigBeanTestClass implements Displayable {

    @PostConstruct
    public void init() {
        displayInfo();
    }
}
