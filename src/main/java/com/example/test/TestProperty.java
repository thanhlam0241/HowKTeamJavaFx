package com.example.studyjavafx;

public class TestProperty {
    public static void main(String[] args) {
        Property property = new Property();
        property.numberProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("observable" + observable);
            System.out.println("oldValue: " + oldValue);
            System.out.println("newValue: " + newValue);
        });
        property.setNumber(10);
        property.setNumber(20);
    }
}
