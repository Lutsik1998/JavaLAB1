package com.labyjava.lab1;


import java.util.List;


/**
 * @author Vladyslav Lutsenko
 * Klasa abstrakcyjna do sortowania liczb calkowitoliczbowych.
 */
public abstract class AbstractIntSorter{
    /**
     * Metoda do sortowania danych calkowitoliczbowych.
     * @param lista - lista do sortowania
     * @return zwraca posortowaną listę
     */
    List<IntElement> solve(List<IntElement> lista){

        return lista;
    }

    /**
     *
     * @return  zwraca String, w którym wskazano jaką metodą odsortowana została lista
     */
    String description(){
        return "Sortuje metodą counting sort";
    }

    /**
     * Metoda zwraca czy algorytm sortowania jest stabilny.
     * @return zwraca czy jest stabilna czy nie
     */
    boolean isStable(){
        return true;
    }

    /**
     * Metoda zwraca czy algorytm sortowania działa w miejscu.
     * @return zwraca czy algorytm sortowania działa w miejscu lub nie.
     */
    boolean isInSite(){
        return true;
    }








}
