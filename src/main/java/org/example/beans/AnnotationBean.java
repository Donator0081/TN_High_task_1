package org.example.beans;


import org.springframework.stereotype.Component;

@Component
public class AnnotationBean {

    public void displayInfo() {
        System.out.println("Class Name is " + this.getClass().getSimpleName());
    }
}
