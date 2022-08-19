package pl.cyber.trainees.wyjasnienia;

public class InstrukcjeWarunkowe {

    public void wyswietl() {
        //wyswietlSwich(4);
        //zadanieSwitch();
        jakaPlec(Plec.KOBIETA);


    }
  /*
Instrukcja warunkowa if

BUDOWA if'a

CONDITION (boolean) - inaczej warunek sprawdzający np i<0, a+b = 2, 2%2 = 0 itp.

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
}

if(2+2 = 4) {
println("dodawanie równe 4");
}

else - potocznie w przeciwnym wypadku

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {
println("dodawanie równe 4");
} else {
println("dodawanie nie równe 4");
}

if(CONDITION) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else if(COUNDITION 2) {
 //pojawić się powinien kod jeśli warunek jest spełniony (true)
} else {
 //pojawić się powinien kod jeśli warunek nie został spełniony (false)
}

a+b = 4
if(2+2 = 4) {<- zostanie wyświetlone
println("dodawanie równe 4");
} else if(2+1 = 3) {
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4");
}


a+b = 4
if
(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+1 = 3) { <- true
println("dodawanie równe 3"); <- zostanie wyświetlone
 } else {
println("dodawanie nie równe 4");


a+b = 4
if(2+5 = 4) { <- false
println("dodawanie równe 4");
} else if(2+2 = 3) { <- false
println("dodawanie równe 3");
 } else {
println("dodawanie nie równe 4"); <- zostanie wyświetlone
}
*/

    // utworzyc metode ktora zwroci true lub false jesli podana liczba w parametrze nie jest równa 10

    public boolean sprawdzenieRownosci(Integer liczba) {


        if (liczba != 10) {
            return true;
        } else {
            return false;

        }
    }


    /*
SWITCH

switch (condition) {
   case "1":  //  condition == "1"
     println("To jest poniedziałek");
     break;
   case "Poniedziałek":
     println("To jest poniedziałek");
     break;
   case "2":  //  condition == "2"
   println("To jest wtorek");
     break;
   case "Wtorek":  //  condition == "Wtorek"
   println("To jest wtorek");
     break;
     .
     .
     .
   default:
     println("b/d");

 }

 switch (condition) {
   case "1":  //  condition == "1"
   case "Poniedziałek":
     println("To jest poniedziałek");
     break;
   case "2":  //  condition == "2"
     break;
   case "Wtorek":  //  condition == "Wtorek"
     break;
     .
     .
     .
   default:
     println("b/d");

 }


 równoznaczne zapisy

   case "1":  //  condition == "1"
     println("To jest poniedziałek");
     break;
   case "Poniedziałek":
     println("To jest poniedziałek
*/
    private void wyswietlSwich(Integer jakiDzienTygodnia) {
        switch (jakiDzienTygodnia) {
            case 1:
                System.out.println("Poniedzialek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piatek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieprawdlowy dzien");
        }


    }

    /*

    Zadanie Wykonać metodę która będzie iterować od 1 do 50 i wyświetli w konsoli odpowiednie napisy:

    dla 0 → Wyświetlam zero
    dla 5 → Wyświetlam 5
    dla 10 → To jest 10
    dla 30 → To jest liczba 30
    dla 49 → To jest liczba 49
    dla pozostałych → Wskazana liczba jest inna niż oczekiwana


    */
    private void zadanieSwitch() {

        for (int i = 0; i < 51; i++) {


            switch (i) {
                case 0:
                    System.out.println("Wyswietlam zero");
                    break;
                case 5:
                    System.out.println("Wyswietlam 5");
                    break;
                case 10:
                    System.out.println("To jest 10");
                    break;
                case 30:
                    System.out.println("To jest liczba 30");
                    break;
                case 49:
                    System.out.println("To jest liczba 49");
                    break;
                default:
                    System.out.println("Wskazana liczba jest inna niz oczekiwana");
            }

        }
    }

    enum Plec {KOBIETA, MEZCZYZNA}

    private void jakaPlec(Plec plec) {
        //dla kobieta wyswietlic jestem kobieta a da mezczyzna jestem mezczyzna
        //wykonac przy uzyciu konstrulck if a potem przez swich
        if (plec == Plec.MEZCZYZNA) {
            System.out.println("Jestem mezczyzna");
        }else{
            System.out.println("Jestem kobieta");

            switch (plec) {
                case KOBIETA -> {
                    System.out.println("Jestem kobieta");
                    break;
                }
                case MEZCZYZNA -> {
                    System.out.println("Jestem mezczyzna");
                    break;
                }

            }


        }
    }
}









