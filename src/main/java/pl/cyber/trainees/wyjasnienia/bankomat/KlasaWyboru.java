package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.Scanner;

public class KlasaWyboru {

    public void uruchom(){
        Scanner scanner = new Scanner(System.in);
        WplacWyplac wplacWyplac = new WplacWyplac();

        boolean wlaczProgram = true;

        while (wlaczProgram){
        System.out.println("Wybierz opcje:");
        System.out.println("1. Wplac gotowke");
        System.out.println("2. Wyplac gotowke");
        System.out.println("3. Sprawdz stan konta");
        System.out.println("4. Przerwij operacje");


        int wybranaOpcja = scanner.nextInt();

        switch (wybranaOpcja) {
            case 1 -> wplacWyplac.wplacGotowke();
            case 2 -> wplacWyplac.wyplacGotowke();
            case 3 -> System.out.println(wplacWyplac.getStanKonta());
            case 4 -> wlaczProgram = false;
        }
        }
    }
}