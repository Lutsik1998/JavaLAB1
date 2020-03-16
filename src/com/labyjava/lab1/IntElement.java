package com.labyjava.lab1;

public class IntElement implements IElement {

    public String name;
    public int value;



    public IntElement(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public float getValue() {
        return (float)value;
    }
}
