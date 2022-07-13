package pl.cyber.trainees;

import kalkulator.Dodawanie;
import kalkulator.Dzielenie;
import kalkulator.Mnozenie;
import kalkulator.Odejmowanie;

public class SimpleApp {
    public static void main(String[] args) {

Dodawanie dodawanie = new Dodawanie();
Odejmowanie odejmowanie = new Odejmowanie();
Mnozenie mnozenie = new Mnozenie();
Dzielenie dzielenie = new Dzielenie();

        System.out.println("Wyniki z klasy Dodawanie");
        System.out.println(dodawanie.name);
        System.out.println(dodawanie.age);
        System.out.println(dodawanie.cokolwiek);
        System.out.println(dodawanie.cokolwiek2 + "\n");

        System.out.println("Wyniki z klasy Odejmowanie");
        System.out.println(odejmowanie.name);
        System.out.println(odejmowanie.age);
        System.out.println(odejmowanie.cokolwiek);
        System.out.println(odejmowanie.cokolwiek2 + "\n");

        System.out.println("Wyniki z klasy Mnozenie");
        System.out.println(mnozenie.name);
        System.out.println(mnozenie.age);
        System.out.println(mnozenie.cokolwiek);
        System.out.println(mnozenie.cokolwiek2 + "\n");

        System.out.println("Wyniki z klasy Dzielenie");
        System.out.println(dzielenie.name);
        System.out.println(dzielenie.age);
        System.out.println(dzielenie.cokolwiek);
        System.out.println(dzielenie.cokolwiek2);









//
//
//        enum Stan {on, off}
//        enum Plec {kobieta, mezczyzna}
//
//        public static String SEPARATOR_SPACJA = " ";
//
//        public static void main (String[]args){
//
//            int scale = 0;
//
////        String space = " ";
////        String a = "Ala";
////        String b = "ma kota";
////
////
////        System.out.println(a + space + b);
////        System.out.println(a + SEPARATOR_SPACJA + b);
//
//
////praca domowa
//            //Utworzenie 2 zmiennych typu String i ich inicjalizacja
//            //Utworzenie 2 zmiennych typu Integer i ich inicjalizacja
//            //Utworzenie 2 zmiennych typu Double i ich inicjalizacja
//
//            //dodawanie , odejmowanie, monożenie i dzielenie.
//            //proszę o wykonanie działania dzielenie przez 0
//
//
//            //region Zaokrąglanie liczb
//            roundNumber("2.34", scale);
//            System.out.println("NEXT");
//            roundNumber("2.44", scale);
//            System.out.println("NEXT");
//            roundNumber("2.46", scale);
//            System.out.println("NEXT");
//            roundNumber("2.5", scale);
//            System.out.println("NEXT");
//            roundNumber("2.55", scale);
//            System.out.println("NEXT");
//            roundNumber("2.6", scale);
//            System.out.println("NEXT");
//            //endregion
//
//            //region praca domowa
//            String valString1 = "pierwszy string";
//            String valString2 = new String("drugi string"); // konstrukcja stowosana np czy odczycie informacji z pliku tekstowego zamiast napisu wtedy podaje się jakąś wartośc ze zmiennej
//
//            Integer valInt1 = 2;
//            Integer valInt2 = Integer.valueOf("3"); // konstrukcja stosowana przy inicjalizacji poprzez wartości napisowe (inaczej Stringi)
//
//            System.out.println("dodawanie: " + add(valInt1, valInt2) + ", odejmowanie: " + subtract(valInt1, valInt2) + ", mnożenie: " + multiplication(valInt1, valInt2) + ", dzielenie: " + division(valInt1, valInt2));
//
//            Double valDouble1 = 10.5;
//            Double valDouble2 = Double.valueOf("4.5");
//
//            System.out.println("dodawanie: " + add(valDouble1, valDouble2) + ", odejmowanie: " + subtract(valDouble1, valDouble2) + ", mnożenie: " + multiplication(valDouble1, valDouble2) + ", dzielenie: " + division(valDouble1, valDouble2));
//
//            BigDecimal valBigDec1 = BigDecimal.valueOf(10.5);
//            BigDecimal valBigDec2 = new BigDecimal("4.5");
//
//            System.out.println("dodawanie: " + add(valBigDec1, valBigDec2) + ", odejmowanie: " + subtract(valBigDec1, valBigDec2) + ", mnożenie: " + multiplication(valBigDec1, valBigDec2) + ", dzielenie: " + division(valBigDec1, valBigDec2));
//
////        Problem dzielenia przez 0
//
////        System.out.println("Dzielenie przez 0" +  division(valDouble1, 0.0));
////        System.out.println("Dzielenie przez 0" +  division(valBigDec1, BigDecimal.ZERO));
//
////Rozwiązanie:
//            System.out.println("Dzielenie przez 0: " + divisionByZero(valDouble1, 0.0));
//            System.out.println("Dzielenie przez 0: " + divisionByZero(valBigDec1, BigDecimal.ZERO));
//            //endregion
//
//        }
//
//        public static int add ( int l1, int l2){
//            var result = l1 + l2;
//            return result;
//
////        return l1 + l2;
//        }
//
//        public static String concat (String l1, String l2){
//            var result = l1 + l2 + "\n";
//            return result;
//        }
//
//        public static void roundNumber ( final String number, int scale)
//        {  //To najczęstszy sposób gdzie ja stosuję zaokrąglanie liczb
//            BigDecimal value = BigDecimal.valueOf(Double.parseDouble(number));
//            var roundHalfUp = value;
//            roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.UP);
//
//            var roundHalfDown = value;
//            roundHalfDown = roundHalfDown.setScale(scale, RoundingMode.DOWN);
//
//            var roundHalfFloor = value;
//            roundHalfUp = roundHalfUp.setScale(scale, RoundingMode.FLOOR);
//
//            System.out.println("Round Half up: " + roundHalfUp);
//            System.out.println("Round Half down: " + roundHalfDown);
//            System.out.println("Round Half floor: " + roundHalfFloor);
//        }
//
//        public static Integer add ( final Integer val, final Integer val2){
//            return val + val2;
//        }
//        public static Integer subtract ( final Integer val, final Integer val2){
//            return val - val2;
//        }
//        public static Integer multiplication ( final Integer val, final Integer val2){
//            return val * val2;
//        }
//        public static Integer division ( final Integer val, final Integer val2){
//            return val / val2;
//        }
//
//        public static Double add ( final Double val, final Double val2){
//            return val + val2;
//        }
//        public static Double subtract ( final Double val, final Double val2){
//            return val - val2;
//        }
//        public static Double multiplication ( final Double val, final Double val2){
//            return val * val2;
//        }
//        public static Double division ( final Double val, final Double val2){
//            return val / val2;
//        }
//
//        public static BigDecimal add ( final BigDecimal val, final BigDecimal val2){
//            return val.add(val2);
//        }
//        public static BigDecimal subtract ( final BigDecimal val, final BigDecimal val2){
//            return val.subtract(val2);
//        }
//        public static BigDecimal multiplication ( final BigDecimal val, final BigDecimal val2){
//            return val.multiply(val2);
//        }
//        public static BigDecimal division ( final BigDecimal val, final BigDecimal val2){
//            return val.divide(val2, 2, RoundingMode.HALF_DOWN);
//        }
//
//        public static Double divisionByZero ( final Double val, final Double val2){
//            var zero = Double.valueOf(0);
//            if (zero.equals(val2)) {
//                System.out.println("Dzialanie przed zero!!!!!");
//                return 0.0;
//            }
//            return val / val2;
//        }
//
//        public static BigDecimal divisionByZero ( final BigDecimal val, final BigDecimal val2){
//            BigDecimal divide = BigDecimal.ZERO;
//
//            try {
//                divide = val.divide(val2, 2, RoundingMode.HALF_DOWN);
//            } catch (final ArithmeticException ex) {
//                System.out.println("Działanie dzielenia przez zero!!!!!!");
//            }
//            return divide;
//        }
//    }
//
//}
//
//}
    }
}