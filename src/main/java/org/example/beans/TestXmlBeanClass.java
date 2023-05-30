package org.example.beans;

import jakarta.annotation.PostConstruct;

public class TestXmlBeanClass implements Displayable {

    @PostConstruct
    public void init() {
        displayInfo();
    }
}
