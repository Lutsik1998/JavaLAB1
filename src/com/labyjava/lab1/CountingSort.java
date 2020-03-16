package com.labyjava.lab1;

import java.util.*;

public class CountingSort extends AbstractIntSorter {
    @Override
    List<IntElement> solve(List<IntElement> lista) {
        isStable();

        List<IntElement> newLista = countSort(lista);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(newLista.get(i).value);
        }
        return newLista;
    }

    static List<IntElement> countSort(List<IntElement> lista){

        int max = maxValue(lista);
        int min = minValue(lista);

        int[] count = new int[2];
        count[0] = min;
        count[1] = max;
        int iloscDodatnich = 0;
        int iloscUjemnych = 0;

        List<Integer> liczbyDodatnie = new ArrayList<Integer>();
        List<Integer> liczbyUjemne = new ArrayList<Integer>();
        for (int i = 0; i <= count[1]; i++) {
            liczbyDodatnie.add(0);
        }
        for (int i = 0; i <= -count[0]; i++) {
            liczbyUjemne.add(0);
        }
        Iterator<IntElement> iter = lista.iterator();
        while (iter.hasNext()) {
            int value = (int)iter.next().getValue();
            if (value >= 0) {
                liczbyDodatnie.set(value, liczbyDodatnie.get(value) + 1);
                iloscDodatnich++;
            } else {
                liczbyUjemne.set(-value, liczbyUjemne.get(-value) + 1);
                iloscUjemnych++;
            }
        }
        for (int i = 1; i <= count[1]; i++) {
            liczbyDodatnie.set(i, liczbyDodatnie.get(i) + liczbyDodatnie.get(i - 1));
        }
        for (int i = 1; i <= -count[0]; i++) {
            liczbyUjemne.set(i, liczbyUjemne.get(i) + liczbyUjemne.get(i - 1));
        }
        List<IntElement> finalLiczbyDodatnie = Arrays.asList(new IntElement[iloscDodatnich]);
        for (int i = 0; i < lista.size(); i++) {
            int value = (int)lista.get(i).getValue();
            if (value >= 0) {
                liczbyDodatnie.set(value, liczbyDodatnie.get(value) - 1);
                finalLiczbyDodatnie.set(liczbyDodatnie.get(value), lista.get(i));
            }
        }
        List<IntElement> finalLiczbyUjemne = Arrays.asList(new IntElement[iloscUjemnych]);
        for (int i = 0; i < lista.size(); i++) {
            int value = (int)lista.get(i).getValue();
            if (value < 0) {
                liczbyUjemne.set(-value, liczbyUjemne.get(-value) - 1);
                finalLiczbyUjemne.set(iloscUjemnych - 1 - liczbyUjemne.get(-value), lista.get(i));
            }
        }

        List<IntElement> finalList = new ArrayList<IntElement>(finalLiczbyUjemne);
        finalList.addAll(finalLiczbyDodatnie);

        lista = finalList;
        return lista;
    }

    public static int maxValue(List<IntElement> lista){
        int maxValue = 0;
        Iterator<IntElement> iter = lista.iterator();
        while (iter.hasNext()){
            IntElement a = iter.next();
            int b = a.value;
            if(maxValue < b){
                maxValue = b;
            }
        }
        System.out.printf("Max = " + maxValue);
        return maxValue;
    }

    public static int minValue(List<IntElement> lista){
        int minValue = 0;
        Iterator<IntElement> iter = lista.iterator();
        while (iter.hasNext()){
            IntElement a = iter.next();
            int tmp = a.value;
            if(minValue > tmp){
                minValue = tmp;
            }
        }
        System.out.println("Min = " +minValue );
        return minValue;
    }

}
