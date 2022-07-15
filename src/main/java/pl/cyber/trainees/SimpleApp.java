package pl.cyber.trainees;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

public class SimpleApp {
    public static void main(String[] args) {

        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020",
                "przod", "Passat", 10000,
                2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("VW", "2020",
                "przod", "Passat", 30000,
                2.0, Kolor.NIEBIESKI);

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



    }











}
