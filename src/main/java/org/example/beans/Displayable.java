package org.example.beans;

public interface Displayable {

    default void displayInfo() {
        System.out.println("Bean created with name " + this.getClass().getSimpleName());
    }
}
