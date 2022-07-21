package pl.cyber.trainees.pracaDomowa1607;

import pl.cyber.trainees.dziedziczenie.Kolor;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StadDane {
    public String wprowadzonaWartoscZKlawiatury(){
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();

    }


    public String daneZPliku (File plikZew) throws FileNotFoundException {
        Scanner scanner = new Scanner (plikZew);
        return scanner.nextLine();
    }
    public Model1 daneOModeluPojazdu(File plikZew) throws FileNotFoundException {
        Model1 modelPojazdu = new Model1();
        Scanner scan = new Scanner(plikZew);
        String liniaWPliku = scan.nextLine();
        String[] tablicaPliku= liniaWPliku.split(", ");

        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setColor(Color.valueOf(tablicaPliku[6]));


        return modelPojazdu;

    }


}

