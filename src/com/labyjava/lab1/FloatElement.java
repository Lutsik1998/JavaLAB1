package com.labyjava.lab1;


/**
 * @author Vladyslav Lutsenko
 * Klasa która przechowywa element typu float
 */
public class FloatElement implements IElement {

    public String name;
    public float value;

    /**
     * Konstruktor - tworzenie nowego obiektu klasy IntElement z parametrami
     * @param name - imię
     * @param value - wartość
     */
    public FloatElement(String name, float value) {
        this.name = name;
        this.value = value;
    }

    /**
     * metoda zwracająca imię elementu
     * @return zwraca imię elementu
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * metoda zwracająca wartość elementu
     * @return zwraca wartość elementu
     */
    @Override
    public float getValue() {
        return value;
    }
}
