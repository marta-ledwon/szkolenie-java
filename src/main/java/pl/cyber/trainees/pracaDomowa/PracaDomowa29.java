package pl.cyber.trainees.pracaDomowa;


import java.util.Scanner;

public class PracaDomowa29 {
    public static void main(String[] args) {

        //1. Napisz metodę, która zwróci Twój aktualny wiek.
        //2. Napisz metodę, która zwróci Twoje imię,
        WiekImie wyswietlDane = new WiekImie();
        wyswietlDane.wiekImie(wyswietlDane.wiek, wyswietlDane.imie);

        //3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
        //parzystość sprawdzamy przez znak % 2 inaczej sprawdzamy jej podzielność przez 2, np. 2 % 2

        Modulo reszta = new Modulo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Licza podzielna przez 2" + "\n" + "Podaj liczbe");
        Integer podanaLiczba = scanner.nextInt();
        System.out.println("Czy liczba jest parzysta? " + "\n" + reszta.modulo(podanaLiczba));


        //4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest
        // podzielna przez 3 i przez 5
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\n" + "Liczba podzielna przez 3 i 5" + "\n" + "Podaj liczbe");
        Integer podanaLiczba2 = scanner2.nextInt();
        System.out.println("Czy liczba jest podzielna przez 3 i 5? " + "\n" + reszta.modulo2(podanaLiczba2));

        //5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
        //podniesienie do potęgi realizujemy przez bibliotekę Math i jej metodę pow(liczba, doJakiejPotęgi)
        //np. Math.pow(2,3)
        Potegowanie potegowanie = new Potegowanie();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("\n" + "Potegowanie" + "\n" + "Podaj liczbe");
        double podanaLiczba3 = scanner3.nextDouble();
        System.out.println(podanaLiczba3 + " do potegi 3 to " + potegowanie.potega(podanaLiczba3));


        //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy
        //pierwiastek kwadratowy realizujemy przez bibliotekę Math i jej metodę sqrt(number)
        //Math.sqrt(number)
        Pierwiastek pierw = new Pierwiastek();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\n" + "Pierwiastkowanie" + "\n" + "Podaj liczbe");
        double podanaLiczba4 = scanner4.nextDouble();
        System.out.println("Pierwiastek z " + podanaLiczba4 + " to " + pierw.pierwiastek(podanaLiczba4));

    }

}
