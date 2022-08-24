package pl.cyber.trainees.wyjasnienia;

import pl.cyber.trainees.wyjasnienia.wyjatek.MojPierwszyException;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Kot;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Papuga;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Pies;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Waz;
import pl.cyber.trainees.wyjasnienia.zwierzeta.Zwierze;
import pl.cyber.trainees.wyjasnienia.zwierzeta.ZwierzeEnum;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Obiekty {

    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO = new TalkDTO("Obiektowsc", "Operacje na obiektach", list);
//    System.out.println(talkDTO.toString());
//    System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.opis);

        talkDTO.opis = "";

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.setOpis("12314521");

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());



        System.out.println(talkDTO.getPrzyklady());

//    Dodawanie do parametru listy nowych wartości ver1

        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");

        talkDTO.modifyList(wiecej);

        System.out.println(talkDTO.getPrzyklady());

        //    Dodawanie do parametru listy nowych wartości ver2
        List<String> wiecej2 = new ArrayList<>();
        wiecej2.addAll(talkDTO.getPrzyklady());
        wiecej2.add("przyklad4");

        talkDTO.setPrzyklady(wiecej2);

        System.out.println(talkDTO.getPrzyklady());

        //    Dodawanie do parametru listy nowych wartości ver3
//    TalkDTO talkDTOv2 = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);
//
//    System.out.println(talkDTOv2.getPrzyklady());
        talkDTO = new TalkDTO(talkDTO.getTematRozmowy(), talkDTO.getOpis(), wiecej2);

        System.out.println(talkDTO.getPrzyklady());
    }


    /*
    zadanie nr1
    Utwórz klasę Kot. Klasa ta powinna mieć następujące pola:
      imię (ciąg znaków) [String]
      data urodzenia (data) [LocalDate]
      waga (liczba zmiennoprzecinkowa) [Double / BigDecimal]
      imię opiekuna (ciąg znaków) [String]
    Klasa ta powinna też mieć jedną metodę o nazwie przedstawSie.
    Metoda ta nie przyjmuje
     żadnych argumentów i zwraca
          ciąg znaków, który jest zdaniem zawierającym imię kotka, jego datę urodzenia,
           wagę oraz imię opiekuna.
     */
    private void zadanie1() {
        Kot kot = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
        System.out.println(kot.przedstawSie());
    }

  /*
  zadanie nr 2
  utworzyć listę 3 kotów a następnie niech każdy z nich się przedstawi.
   */

    private void zadanie2() {

//    var kot1 = new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz");
//    var kot2 = new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz");
//    var kot3 = new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz");
//
//    List<Kot> koty = new ArrayList<>();
//    koty.add(kot1);
//    koty.add(kot2);
//    koty.add(kot3);

        List<Kot> koty = new ArrayList<>();
        koty.add(new Kot("Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        koty.add(new Kot("Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        koty.add(new Kot("Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Kot kot : koty) {
            System.out.println(kot.przedstawSie());
        }
    }

    /*
     zadanie nr 3
     utworzyć listę 3 kotów dodać je do List<Zwierze>
     a następnie niech każdy z nich się przedstawi.
    */
    private void zadanie3() {

        List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(200.0 , true, "Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
        zwierze.add(new Kot(200.0 , false, "Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
        zwierze.add(new Kot(250.0 , true, "Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));

        for (Zwierze zw : zwierze) {
            if(zw instanceof Kot) {
                System.out.println(((Kot)zw).przedstawSie());
            }
        }
    }

     /*
    zadanie nr 4
    utworzymy klase Pies, ktora dziedziczy po klasie Zwierze
    utworzyć listę 3 kotów, 1 psa następnie  dodać je do List<Zwierze>
    a następnie niech każdy z nich się przedstawi.
    Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
   */

//    private void zadanie4() {
//
//        List<Zwierze> zwierze = new ArrayList<>();
//        zwierze.add(new Kot(200.0 , true, "Felix", LocalDate.of(2020, 7, 2), 3.0, "Mariusz"));
//        zwierze.add(new Kot(200.0 , false, "Felix2", LocalDate.of(2020, 8, 2), 3.5, "Mariusz"));
//        zwierze.add(new Kot(250.0 , true, "Felix3", LocalDate.of(2020, 9, 2), 4.0, "Mariusz"));
//        zwierze.add(new Pies(250.0 , true, "Goldi", LocalDate.of(2020, 9, 2), 14.0, "Mariusz"));
//
//        for (Zwierze zw : zwierze) {
//            if(zw instanceof Kot) {
//                System.out.println(((Kot)zw).przedstawSie());
////        System.out.println((zw).dajGlos());
//            } else if (zw instanceof Pies) {
//                System.out.println(((Pies)zw).przedstawSie());
////        System.out.println((zw).dajGlos());
//            }
//            System.out.println((zw).dajGlos());
//            System.out.println(zw.dajGlos2());
//        }
//    }
//

  /*
    zadanie nr 5
    Utworzyć Enum o nazwie ZwierzeEnum w którym będą dostępne opcje:
    - KOT
    - PIES
    utworzyć listę 3 kotów, 1 psa poprzez utworzenie pliku zwierzeta.txt
    następnie odczytaniu pliku przez aplikację.
    następnie  dodać zwierząt do List<Zwierze> przy użyciu enuma.
    a następnie niech każdy z nich się przedstawi.
    Dodatkowo wywołać metodę (skorzystamy z przysłaniania metod) dajGlos()
   */
//
//    private void zadanie5() {
//        File file = new File("src/main/resources/zwierzeta.txt");
//
//        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);
//
//        for (Zwierze zw : zwierzeList) {
//            if(zw instanceof Pies) {
//                System.out.println(((Pies)zw).przedstawSie());
//            } else if(zw instanceof Kot) {
//                System.out.println(((Kot)zw).przedstawSie());
//            }
//
//            System.out.println(zw.dajGlos());
//        }
//    }
//
//    private List<Zwierze> pobierzInformacjeZPliku(File file) {
//        Scanner scan = null;
//        try {
//            scan = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new MojPierwszyException("Komunikat naszego błędu!");
//        }
//
//        List<Zwierze> zwierzeta = new ArrayList<>();
//
//        while (scan.hasNext()) {
//            String rowInFile = scan.nextLine();  //PIES,Goldi,2020/05/10,14,Mariusz,250,true
//            String[] tablicaPliku = rowInFile.split(",");
//            if(ZwierzeEnum.PIES.name().equals(tablicaPliku[0])) {
//                Pies pies = new Pies();
//                zwierzeta.add(pies.convertFromFile(rowInFile));
//            } else if(ZwierzeEnum.KOT.name().equals(tablicaPliku[0])) {
//                Kot kot = new Kot();
//                zwierzeta.add(kot.convertFromFile(rowInFile));
//            } else if(ZwierzeEnum.WAZ.name().equals(tablicaPliku[0])) {
//                Waz waz = new Waz();
//                zwierzeta.add(waz.convertFromFile(rowInFile));
//            } else if(ZwierzeEnum.PAPUGA.name().equals(tablicaPliku[0])) {
//                Papuga papuga = new Papuga();
//                zwierzeta.add(papuga.convertFromFile(rowInFile));
//            }
//        }
//
//        return zwierzeta;
   // }
   /*
   Firma
      Osoba
        Pracownik
          Sekretarka
          Programista
          Tester
        Szef
      adres
   class Firma {
   List<Osoba> osoby;
   String adres
   }
   class Osoba {
     String pietroNaKtorymPracuje;
     powiedzGdziePracujesz(){}
   }
   class Szef extends Osoba {
     String imie;
     przyznajPremie(){}
   }
   class Sekretarka extends Pracownik {
     String imie;
     odbierzTelefon(){}
   }
      class Programista extends Pracownik {
     String imie;
     stworzAplikacje(){}
   }
    class Tester extends Pracownik {
     String imie;
     //posiada rowniez pola
     String numerPokoju;
     String pietroNaKtorymPracuje;
     testujAplikacje(){}
     //posiada rowniez metodę
     siedzeWPokoju(){}
     powiedzGdziePracujesz(){}
   }
   class Pracownik extends Osoba {
      String numerPokoju;
      siedzeWPokoju(){}
   }
       if(Pracownik instanceof Sekretarka) {
         System.out.println( ((Sekretarka)pr).odbierzTelefon());
       }
       if(Pracownik instanceof Programista) {
         System.out.println( ((Programista)pr).stworzAplikacje());
       }
       if(Pracownik instanceof Tester) {
         System.out.println( ((Tester)pr).testujAplikacje());
       }
    */


  /*
     List<Osoba> osoby = new ArrayList<>();
     osoby.add(new Programista());
     osoby.add(new Tester());
     osoby.add(new Szef());
     if(Osoba instanceof Sekretarka) {
         System.out.println( ((Sekretarka)pr).odbierzTelefon());
     }
   */


    // zadanie 6
    // Utorzenie 2 innych typów zwierząt oraz ich przedstawienie
    // proponuję nowy plik w katalogu resources
//    private void zadanie6() {
//        File file = new File("src/main/resources/zwierzeta.txt");
//
//        List<Zwierze> zwierzeList = pobierzInformacjeZPliku(file);
//
//        for (Zwierze zw : zwierzeList) {
//            if(zw instanceof Pies) {
//                System.out.println(((Pies)zw).przedstawSie());
//            } else if(zw instanceof Kot) {
//                System.out.println(((Kot)zw).przedstawSie());
//            } else if(zw instanceof Waz) {
//                System.out.println(((Waz)zw).przedstawSie());
//            } else if(zw instanceof Papuga) {
//                System.out.println(((Papuga)zw).przedstawSie());
//            }
//
//            System.out.println(zw.dajGlos());
//        }
//    }

    public void uruchom() {

//    wyswietlTalkDTO();
//    zadanie1();
//    zadanie2();
//    zadanie4();
//    zadanie5();
//    zadanie6();

//    DateConverter dateConverter = new DateConverter();
//
//    try {
//      System.out.println(dateConverter.stringToDate("2022/05/10"));
//    } catch (ParseException e) {
//      throw new RuntimeException(e);
//    }
    }
}