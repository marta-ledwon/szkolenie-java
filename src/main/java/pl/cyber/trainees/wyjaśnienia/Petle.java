package pl.cyber.trainees.wyjaśnienia;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petle {

  /*
Pętla for i foreach
BUDOWA for
int i = 0 - inicjalizacja parametru początkowego 'do przechodzenia po pętli'
i<5 - warunek spełnienia kolejnego przejścia
i++ - inkrementacja wartości początkowej o 1
for(int i = 0; i<5; i++) {
//kod wykonania
//pritnln
//dodawnie w jakiś sposób
//dodawanie do listy elementy
}
JAK NIE STOSOWAĆ FOR
for(int i = 0; i<5; i++); {
}
PUŁAPKA:
for(int i = 0; i<5; i--); { -- tzw pętla nieskończona
 println(i);
 }
 for(int i = 0; i=-5; i++); { -- tzw pętla nieskończona
 println(i);
 }
 BUDOWA foreach
 for(TypDanych elementListy : lista) {
 }
 UWAGA!!!
 Usuwanie elementów z listy
 do rozwiązania usuwania elementów stosuję się wyłącznie for.
 for(int i = 0; i<5; i++) {
 lista.get(i)
 }
 List<>
 remove(); metoda do usuwania rekordów
   */


    public void uruchom() {
//    List<BigDecimal> lista = new ArrayList<>();
//    lista.add(BigDecimal.valueOf(10.0));
//    lista.add(BigDecimal.valueOf(2.0));
//    lista.add(BigDecimal.valueOf(5.6));
//    lista.add(BigDecimal.valueOf(21.8));
//    lista.add(BigDecimal.valueOf(2.1));
//    lista.add(BigDecimal.valueOf(41.0));
//    lista.add(BigDecimal.valueOf(14.0));
//    lista.add(BigDecimal.valueOf(1.0));
//    lista.add(BigDecimal.valueOf(4.0));
//
//    rozwiazanieZadanie1(lista);
//    choinkaRozbudowana2(3);
//    tylkoPodzielne();

        pierwszyProgramWhile();
    }

//  Zadanie nr 1
//  Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
//  a) wyświetli każdy element listy jeden po drugim
//  b) każdy element listy doda do siebie.

    private void rozwiazanieZadanie1(List<BigDecimal> list) {
//    BigDecimal sumaLiczb = BigDecimal.ZERO;
        BigDecimal sumaLiczb = BigDecimal.valueOf(0);

        for (BigDecimal liczba : list) {

            System.out.println(liczba);
            sumaLiczb = sumaLiczb.add(liczba);
        }

        System.out.println("Suma liczb: " + sumaLiczb);
    }

    //Zadanie Choinka
    //klasyczne fory (a dokładnie 2 fory)
    //
    //metoda będzie przyjmować parametr jako wysokość

    /*
     *
     ***
     *****
     */


    private void choinkaProsta() {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }

    private void choinkaRozbudowana(Integer wysokoscChoinki) {
    /*
    int <-> Integer
    double <-> Double
    BigInteger, BigDecimal
    long <-> Long
    etc.
     */

        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private void choinkaRozbudowana2(Integer wysokoscChoinki) {

        Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
        System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
        System.out.println();

        for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {  //x = x + 2 ///  x++
            Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
            for (int y = 0; y < spacje + x; y++) {
                if (y < spacje) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    // Zadanie
//  Utworzyć metodę, która przejdzie (będzie iterować) po liczbach od 1 do 100
//  Natomiast wyświetli tylko te które są podzielne przez 5
//  oraz dodatnie ich do siebie


    public void tylkoPodzielne() {

        Integer sumaLiczb = 0;
        Integer iloscLiczb = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

                sumaLiczb = sumaLiczb + i;
                iloscLiczb += 1;
            }

//      System.out.println("Suma po każdym przebiegu pętli: " + sumaLiczb);
        }

        System.out.println("SUMA Liczb: " + sumaLiczb);
        System.out.println("Ilość znalezionych liczb: " + iloscLiczb);
    }


  /*
  WHILE oraz  do While
while - słowo kluczowe określające deklarację pętli while
do - słowo kluczowe określające deklarację pętli do-while
(condition) - warunek, który określa nam zakończenie działania pętli, aby pętla while
zadziałała to piersze srawdzenie musi się nie spełniać
{} - rozpoczęcie i zakończenie bloku / struktury pętli w ramach tych nawiasów znajduje się kod funkcji, którą ma wykonać program
STRUKTURA DO ZAPAMIĘTANIA:
  while(condition) {
  //blok kodu
  }
  do {
  //blok kodu
  } while(condition);
int liczba = 1;
while(liczba < 1) {
println("to jest liczba: " + liczba);
liczba++;
}
do {
println("to jest liczba: " + liczba);
liczba++;
} while (liczba < 23)
   */

    private void pierwszyProgramWhile() {
        int liczba = 1;

        while (liczba < 1) {
            System.out.println("while, to jest liczba: " + liczba);
            liczba++;
        }

        do {
            System.out.println("do-while, to jest liczba: " + liczba);
            liczba++;
        } while (liczba <= 23);
    }

    //wykonać for od 1 do 10 wyświetlić sumęFor i następnie wykonać to samo przy użyciu while/do-while
    //oraz wykorzystać if do porównania liczb, jeśli się uzgodnią to wyświetlamy true w przeciwnym wypadku false

    private void sumaLiczbaZForIWhile() {

        Integer sumaFor = 0;
        Integer sumaWhile = 0;
        Integer licznikWhile=0;

        for (int i = 0; i <= 10; i++) {
            sumaFor += i;
        }

        while (licznikWhile<=10) {
            sumaWhile += licznikWhile;

            licznikWhile++;
        }

        System.out.println("Suma For: " + sumaFor);
        System.out.println("Suma While: " + sumaWhile);

        if(sumaFor == sumaWhile) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


    // do domu metodę public void tylkoPodzielne() { przerobić na while.

    //zmienna o wartosci 1, wykozystaj while.
    // Podnos licznik x2 do momentu aż liczba nie przekroczy 100
    // oraz wyswietl ile razy pętla sięwykonała
}