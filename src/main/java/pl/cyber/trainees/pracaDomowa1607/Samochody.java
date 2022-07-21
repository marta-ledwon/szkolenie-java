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


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Samochody {
    public static void main(String[] args) throws FileNotFoundException {



            /* System.out.println("Jak masz na imie?");
            String firstName = stadDane.wprowadzonaWartoscZKlawiatury();
            System.out.println("Witaj " + firstName + "!!!");*/


        StadDane stadDane = new StadDane();

        String firstNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod1.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstNameFromFile);
        String secondNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod2.txt"));
        System.out.println(secondNameFromFile);
        String thirdNameFromFile = stadDane.daneZPliku(new File("src/main/resources/samochody/samochod3.txt"));
        System.out.println(thirdNameFromFile);





            Model1 modelPojazdu1 = new Model1();
            var modelPojazdu2 = new Model1("VW", "2020",
                    "przod", "Passat", 10000,
                    2.0, Color.ZIELONY);
            var modelPojazdu3 = new Model1("VW", "2020",
                    "przod", "Passat", 30000,
                    2.0, Color.NIEBIESKI);


        }
    }

