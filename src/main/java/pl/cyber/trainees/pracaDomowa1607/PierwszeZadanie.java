package pl.cyber.trainees.pracaDomowa1607;

import javax.servlet.ServletOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PierwszeZadanie {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe calkowita");
        Integer liczba = scanner.nextInt();
        System.out.println("Podaj druga liczbe calkowita");
        Integer liczba2 = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe calkowita");
        Integer liczba3 = scanner.nextInt();
        System.out.println("Podaj czwarta liczbe calkowita");
        Integer liczba4 = scanner.nextInt();
        System.out.println("Podaj piata liczbe calkowita");
        Integer liczba5 = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        lista.add(liczba);
        lista.add(liczba2);
        lista.add(liczba3);
        lista.add(liczba4);
        lista.add(liczba5);


        Integer wynikDodawania = liczba + liczba2 + liczba3 + liczba4 + liczba5;
        System.out.println("\n" + "Dodawanie liczb [" + liczba + ", " + liczba2 + ", " + liczba3 + ", "+ liczba4 + ", "+ liczba5 + "]= "
                + wynikDodawania);

        System.out.println("\n"+"Wynik mnozenia podanych liczb przez 10: ");

        for(int i = 0; i < lista.size(); i++){
            if(i>0){
                System.out.println(i + " * 10 = " + (i*10));
            } else{
                System.out.println();
            }

        }
        System.out.println("Wyniki dzielenia podanych liczb przez 2: ");

        for(int i = 0; i < lista.size(); i++){
            if(i>0){
                System.out.println(i + " / 2 = " + (i/2));
            } else{
                System.out.println();
            }

        }





    }


}
