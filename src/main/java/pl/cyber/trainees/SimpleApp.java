package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.spotkania.Petle;

import java.util.ArrayList;
import java.util.List;

public class SimpleApp {

    public static void main(String[] args) {


        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
                "przod", "Passat", 10000,
                2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("VW", "2020",
                "przod", "Passat", 30000,
                2.0, Kolor.NIEBIESKI);

        List<String> auto1 = new ArrayList<>();
        auto1.add("BMW");
        auto1.add("Ford");
        auto1.add("KIA");



        for (int i = 0; i < auto1.size(); i++) {
            var tmp = auto1.get(i);
            if (tmp == "pierwszy") {
                System.out.println("pierwszy element: " + auto1.get(i));
            } else {

                System.out.println("inny element: " + auto1.get(i));
            }


            modelPojazdu1.setMarka("Opel");
            modelPojazdu1.setRocznik("2021");
            modelPojazdu1.setNaped("przod");
            modelPojazdu1.setNazwa("Corsa");
            modelPojazdu1.setPrzebieg(14000);
            modelPojazdu1.setPojemnoscSilnika(2.2);
            modelPojazdu1.setKolor(Kolor.CZERWONY);

            System.out.println(modelPojazdu1.toString());
            System.out.println(modelPojazdu2);
            System.out.println(modelPojazdu3);

            System.out.println("marka pojazdu: " + modelPojazdu2.getMarka());
            System.out.println("naped: " + modelPojazdu2.getNaped());
            System.out.println("nazwa: " + modelPojazdu2.getNazwa());

        /* KOLEKCJE W JAVIE - zbiory danych
        mamy 4 rodzaje kolekcji:  lista (List), Set(zbiór), Map (mapa), Queue - kolejka



        */

        }

        Petle petle = new Petle();
        petle.wyswietlLiczby();

    }

}



