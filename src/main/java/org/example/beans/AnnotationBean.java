package org.example.beans;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBean implements Displayable {

    @PostConstruct
    public void init() {
        displayInfo();
    }

}
