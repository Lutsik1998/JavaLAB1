package com.labyjava.lab1;


import java.util.List;

/**
 * @author Vladyslav Lutsenko
 * Klasa sortująca dane algorytmem Quick Sort
 */
public class QuickSort extends AbstractFloatSorter {

    /**
     * Metoda zwracająca opis, w którym napisano jaką metodą bylo odsortowaną
     * @return zwraca String z opisem
     */
    @Override
    String description() {
        return "Sortuje metodą Quik Sort";
    }

    /**
     *Metoda do sortowania danych zarówno calkowitoliczbowych jak i zmiennoprzecinkowych
     * @param lista - lista do sortowania
     * @return zwraca posortowaną listę.
     */
    @Override
    List<IElement> solveFloatAndInt(List<IElement> lista) {
        quickSort(lista, 0, lista.size()-1);
        return lista;
    }

    /**
     * Metoda do sortowania algorytmem Quick Sort
     * @param lista - lista do sortowania
     * @param low - element początkowy
     * @param high - element końcowy
     */
    public static void quickSort(List<IElement> lista, int low, int high){
        if (lista.size() == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;
        float opora = lista.get(middle).getValue();

        int i = low, j = high;
        while (i <= j) {
            while (lista.get(i).getValue() < opora) {
                i++;
            }

            while (lista.get(j).getValue() > opora) {
                j--;
            }

            if (i <= j) {
                IElement temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(lista, low, j);

        if (high > i)
            quickSort(lista, i, high);
    }




}
