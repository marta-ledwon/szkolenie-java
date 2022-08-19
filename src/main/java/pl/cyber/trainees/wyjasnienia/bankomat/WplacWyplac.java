package pl.cyber.trainees.wyjasnienia.bankomat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WplacWyplac {

    Scanner scanner = new Scanner(System.in);

    private List<Integer> stanKonta = new ArrayList<>();

    public void wplacGotowke(){
        System.out.println("Wybrano - WPLAC GOTOWKE");
        System.out.println("Wplac 10, 20, 50, 100, 200 lub 500");
        stanKonta.add(scanner.nextInt());
    }
    public void wyplacGotowke(){
        System.out.println("Wybrano - WYPLAC GOTOWKE");
        System.out.println("Wyplac 10, 20, 50, 100, 200 lub 500");
        stanKonta.remove(scanner.nextInt());
    }
    public List<Integer> getStanKonta(){

        return stanKonta;
    }

}
