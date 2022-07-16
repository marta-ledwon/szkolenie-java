package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.*;

public class Petle {
    public void wyswietlLiczby() {

        for (int i = 1; i < 101; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }

        }
    }


    public void dodawanieElementowListy(List<Double> lista) {

        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + "+" + result);
            result = Dodawanie.add(result, element);
            result = result + element;

        }
        System.out.println("Wynik dodawania listy:  " + result);

        //Utworzenie metody, która wyświetli zadany set
        // Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        // następnie przez pętlę foreach wyświetlić elementy.
    }

    public void wyswietlenieSet() {
        Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        for (Integer liczba : intSet) {
            System.out.print(liczba + ", ");
        }


    }
}



