package pl.cyber.trainees.wyjaśnienia;


public class Petle {
    public void uruchom() {

        //podzielnePrzez();
        licznikRazyDwa();
    }
    //1. metodę public void tylkoPodzielne() { przerobić na while.
    //zmienna o wartosci 1, wykorzystaj while.
    private void podzielnePrzez(){

        int i = 1;
        int ileRazy = 0;
        int suma = 0;

        while(i<=100){
            if(i%5==0)
                System.out.println(i);
                i++;

            suma = suma += i;
            ileRazy += 1;
        }

        System.out.println("Suma liczb: " + suma);
        System.out.println("Ile razy wykonano petle? " + ileRazy);

    }
    // 2. Podnos licznik x2 do momentu aż liczba nie przekroczy 100
    // oraz wyswietl ile razy pętla sięwykonała

    private void licznikRazyDwa(){

        int i = 1;
        int ileRazy2 = 0;

        while(i<=100){
            System.out.println(i*2);
            i++;

            ileRazy2 += 1;
        }
        System.out.println("Ile razy petla sie wykonala? " + ileRazy2);
    }
}



