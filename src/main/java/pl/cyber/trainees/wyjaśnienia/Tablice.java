package pl.cyber.trainees.wyjaśnienia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tablice {
    public void uruchom() {
        //tablica();
        //drugaTablica();
        trzeciaTablica();
    }

    /*
      Tworzenie tablic jednowymiarowych w Java
      TypDanych[] nazwa_tablicy = new TypDanych[(int) zakres_tablicy];

      np.
      Integer[] tablicaInt = new Integer[10];

      Integer[] nowaTablica = {1, 2, 3, 4, 19};

      Zalecana forma:
      Integer[] nowaTablica = new Integer[5];
      nowaTablica[0] = 1;
      nowaTablica[1] = 2;
      nowaTablica[2] = 3;
      nowaTablica[3] = 4;
      nowaTablica[4] = 19;
       */
  /*
  Tworzenie tablic wielowymiarowych w Java
  TypDanych[][] nazwa_tablicy = new TypDanych[(int) zakres_tablicy1][zakres_tablicy2];
  Integer[][] tablicaInt = new Integer[10][10];

  Integer[][] nowaTablica = new Integer[1][1];
  nowaTablica[A][1] = 1;
  nowaTablica[0][1] = 1;
  nowaTablica[1][0] = 1;
  nowaTablica[1][1] = 1;
   */
    private void tablica() {

        Integer[] tablica1 = new Integer[5];
        tablica1[0] = 2;
        tablica1[1] = 3;
        tablica1[2] = 34;
        tablica1[3] = 5;
        tablica1[4] = 5;

        int n = 0;
        while (n < tablica1.length) {
            System.out.println(tablica1[n]);
            n++;
        }

        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[i]);

        }

    }


    private void drugaTablica() {
            Integer[] tablica1 = new Integer[5];

            Random rand = new Random();

            //użyć wystarczy rand.nextInt();
            // rand.nextInt(liczba);
            // rand.nextInt(200); -> losowanie liczb z zakresu 0 - 200
            // rand.nextInt(150)+50; -> losowanie liczb z zakresu 50 - 200
            // rand.nextInt(KoniecZakresu-PoczątekZakresu)+Początek zakresu;

            for (int i=0; i<tablica1.length; i++){
                tablica1[i] = rand.nextInt(150)+50;
            }

            for (Integer element :
                    tablica1) {
                System.out.println(element);
            }
        }



//Zadanie 3
//Zadanie 2 przerobić w taki spobób aby tablicę zastąpić listą
//private void ListaPierwsza() {
//    List<Integer> lista = new ArrayList<>();
//
//    Random rand = new Random();
//
//    for (int i=0; i<5; i++){
//        lista = rand.nextInt(150+50);
//    }
//
//}


//Zadanie 4
//na przykładzie powyższych zadań utworzyć tablicę wielowymiarową 10x10 i wypełnić losowymi danych

private void trzeciaTablica() {
    Integer[][] tablica = new Integer[10][10];

    Random random2 = new Random();

    for (int i=0; i<tablica.length; i++){
        for(int j=0; j<tablica.length; j++){
        tablica[i][j] = random2.nextInt(150)+50;
            System.out.println(tablica[i][j]);
    }

}


}
}