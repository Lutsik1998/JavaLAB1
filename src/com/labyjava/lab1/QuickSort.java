package com.labyjava.lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort extends AbstractFloatSorter {




    @Override
    List<IElement> solveFloatAndInt(List<IElement> lista) {
        quickSort(lista, 0, lista.size()-1);
        return lista;
    }

    public static void quickSort(List<IElement> lista, int low, int high){
        if (lista.size() == 0)
            return;

        if (low >= high)
            return;

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        float opora = lista.get(middle).getValue();
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (lista.get(i).getValue() < opora) {
                i++;
            }

            while (lista.get(j).getValue() > opora) {
                j--;
            }

            if (i <= j) {
                //robimy rotacje
                IElement temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
        }

        //wywolanie rekurcji dla obu czesci(Lewej oraz prawej)
        if (low < j)
            quickSort(lista, low, j);

        if (high > i)
            quickSort(lista, i, high);
    }




}
