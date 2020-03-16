package com.labyjava.lab1;

import java.util.List;

public class SelectionSort extends AbstractFloatSorter {


    @Override
    List<IElement> solveFloatAndInt(List<IElement> lista) {
        selSort(lista);
        return lista;
    }

    public static void selSort(List<IElement> lista){
        int inputLength = lista.size();
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;
//find the first, second, third, fourth... smallest value
            for (int j = i + 1; j < inputLength; j++) {
                if (lista.get(j).getValue() < lista.get(min).getValue()) {
                    min = j;
                }
            }
//swaps the smallest value with the position 'i'
            IElement tmp = lista.get(i);
            lista.set(i, lista.get(min));
            lista.set(min, tmp);
            //next pls
        }

    }


}
