package com.labyjava.lab1;

/**
 * @author Vladyslav Lutsenko
 * Klasa która przechowywa element typu int
 */
public class IntElement implements IElement {


    public String name;
    public int value;


    /**
     * Konstruktor - tworzenie nowego obiektu klasy IntElement z parametrami
     * @param name - imię
     * @param value - wartość
     */
    public IntElement(String name, int value) {
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
        return (float)value;
    }
}
