package com.labyjava.lab1;

import java.util.List;
/**
 * @author Vladyslav Lutsenko
 * Klasa sortująca dane algorytmem Selection Sort
 */
public class SelectionSort extends AbstractFloatSorter {
    /**
     * Metoda zwracająca opis, w którym napisano jaką metodą bylo odsortowaną
     * @return zwraca String z opisem
     */
    @Override
    String description() {
        return "Sortuje metodą selection sort";
    }
    /**
     *Metoda do sortowania danych zarówno calkowitoliczbowych jak i zmiennoprzecinkowych
     * @param lista - lista do sortowania
     * @return zwraca posortowaną listę.
     */
    @Override
    List<IElement> solveFloatAndInt(List<IElement> lista) {
        selSort(lista);
        return lista;
    }
    /**
     * metoda sortujaca algorytmem Selection Sort.
     * @param lista - lista do sortowania
     * @return zwraca posortowaną listę.
     */
    public static void selSort(List<IElement> lista){
        int inputLength = lista.size();
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;

            for (int j = i + 1; j < inputLength; j++) {
                if (lista.get(j).getValue() < lista.get(min).getValue()) {
                    min = j;
                }
            }

            IElement tmp = lista.get(i);
            lista.set(i, lista.get(min));
            lista.set(min, tmp);

        }

    }


}
