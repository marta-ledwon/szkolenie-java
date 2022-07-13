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

        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu2);
        System.out.println(modelPojazdu3);

        System.out.println("marka pojazdu: " + modelPojazdu2.getMarka());
        System.out.println("naped: " + modelPojazdu2.getNaped());
        System.out.println("nazwa: " + modelPojazdu2.getNazwa());



    }











}
