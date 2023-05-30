package org.example.beans;

import jakarta.annotation.PostConstruct;

public class TestXmlBeanClass {

    @PostConstruct
    public void init() {
       displayInfo();
    }

    public void displayInfo() {
        System.out.println("Class Name is " + this.getClass().getSimpleName());
    }



}
