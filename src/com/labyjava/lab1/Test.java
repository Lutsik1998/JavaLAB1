package com.labyjava.lab1;

import java.util.ArrayList;
import java.util.List;

public class Test extends CountingSort {
    public static void main(String[] args) {
        List<IntElement> x = new ArrayList<IntElement>();
        x.add(new IntElement("1",5));
        x.add(new IntElement("2",3));
        x.add(new IntElement("3",5));
        x.add(new IntElement("4",7));
        x.add(new IntElement("5",11));
        x.add(new IntElement("6",12));
        x.add(new IntElement("7",0));
        x.add(new IntElement("8",2));
        x.add(new IntElement("9",2));
        x.add(new IntElement("9",-12));
        x.add(new IntElement("9",-2));
        x.add(new IntElement("9",-198));
        x.add(new IntElement("9",190));
        x.add(new IntElement("9",-200));
        System.out.println("DO SORTOWANIA");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).getValue());
        }
        int low = 0;
        int high = x.size() - 1;

        List<IntElement> y = new ArrayList<IntElement>();
        CountingSort sort = new CountingSort();


        //quickSort(x, low, high);
        System.out.println("PO SORTOWANIU");
        /*for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).getValue());
        }*/
        sort.solve(x);
        maxValue(x);
        minValue(x);
    }

}
