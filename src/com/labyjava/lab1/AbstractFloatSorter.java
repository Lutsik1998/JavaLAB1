package com.labyjava.lab1;

import java.util.List;
/**
 * @author Vladyslav Lutsenko
 * Klasa abstrakcyjna do sortowania danych zarówno calkowitoliczbowych jak i zmiennoprzecinkowych.
 */
public abstract class AbstractFloatSorter extends AbstractIntSorter {
    /**
     *Metoda do sortowania danych zarówno calkowitoliczbowych jak i zmiennoprzecinkowych
     * @param lista - lista do sortowania
     * @return zwraca posortowaną listę.
     */
    List<IElement> solveFloatAndInt(List<IElement> lista){
        return lista;
    }
}
