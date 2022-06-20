package com.example.studyjavafx;
import javafx.beans.property.*;
public class Property {
    private DoubleProperty number = new SimpleDoubleProperty();

    public double getNumber() {
        return number.get();
    }

    public DoubleProperty numberProperty() {
        return number;
    }

    public void setNumber(double number) {
        this.number.set(number);
    }
}
