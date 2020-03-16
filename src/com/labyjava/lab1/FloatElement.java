package com.labyjava.lab1;

public class FloatElement implements IElement {
    public String name;
    public float value;

    public FloatElement(String name, float value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getValue() {
        return value;
    }
}
