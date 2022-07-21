package pl.cyber.trainees.pracaDomowa1607;
/*
        Każdy plik należy zainicjalizować do nowego obiektu
        Następnie wyświetlić następujące informacje:
        Pojazd nr 1: w
        Pojazd nr 2: w
        Pojazd nr 3: w
        Laczna ilosc przejechanych kilometrow przez samochody: w
        Dostepne pojemosci silnikow samochodow: x, y, z
        Do wykonania zadania nalezy wykorzystać zdobytą wiedzę z odbytych zajęć*/


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Samochody {
    public static void main(String[] args) throws FileNotFoundException {


        StadDane stadDane = new StadDane();

        String firstNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod1.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pojazd numer 1: " + firstNameFromFile);
        String secondNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod2.txt"));
        System.out.println("Pojazd numer 2: " + secondNameFromFile);
        String thirdNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod3.txt"));
        System.out.println("Pojazd numer 3: " + thirdNameFromFile);

    Model1 model1 = new Model1("KIA", "2020", "przod", "Optima", 10000, 2.2, Color.BRAZOWY);
    Model1 model2 = new Model1("Opel", "1999", "tyl", "Corsa", 120000, 2.0, Color.CZERWONY);
    Model1 model3 = new Model1("Hyundai", "2000", "przod", "ix30", 80000, 2.2, Color.BIALY);

    Integer sumaPrzebieg = model1.getPrzebieg() + model2.getPrzebieg() + model3.getPrzebieg();
        System.out.println("\n" + "Laczna liczba kilometrow przejechanych przez samochody: " + sumaPrzebieg);
        System.out.println("\n" + "Dostepne pojemnosci silnikow: " + model1.getPojemnoscSilnika() + ", " + model2.getPojemnoscSilnika() + ", "
                + model3.getPojemnoscSilnika());






        }
    }

