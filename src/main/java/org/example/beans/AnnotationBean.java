package org.example.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBean {

    @PostConstruct
    public void init() {
        displayInfo();
    }

    public void displayInfo() {
        System.out.println("Class Name is " + this.getClass().getSimpleName());
    }
}
