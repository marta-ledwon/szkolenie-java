package pl.cyber.trainees.service;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDanych {
    public String wprowadzonaWartoscZKlawiatury(){
       Scanner scan = new Scanner(System.in);
       //system.in - to obiekt reprezentujacy InputStream.
        // Odpowiada za przetwarzanie danych
        return scan.nextLine();

    }
    //throws (mówi aplikacji pojawiajacy sie blad przeniesc do miejsca wykonania metodyFileNotFoundException
    public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException {
       Model modelPojazdu = new Model();
       Scanner scan = new Scanner(plikZew);
       String liniaWPliku = scan.nextLine();
       String[] tablicaPliku= liniaWPliku.split(", ");

       modelPojazdu.setMarka(tablicaPliku[0]);
       modelPojazdu.setRocznik(tablicaPliku[1]);
       modelPojazdu.setNaped(tablicaPliku[2]);
       modelPojazdu.setNazwa(tablicaPliku[3]);
       modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4])); //metoda zamieniajaca stringa na integera
       modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
       modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));


        return modelPojazdu;

    }


}
