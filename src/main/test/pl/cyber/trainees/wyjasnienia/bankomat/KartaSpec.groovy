package pl.cyber.trainees.wyjasnienia.bankomat

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll


class KartaSpec extends Specification {

    private Karta underTest

    static def nrKartyStub = 12345678
    @Shared
    def pinKartyStub = 1234
    static def saldoStub = 0

    void setup() {
//        underTest = new Karta(1214, 123, 12)
    }

    def "Subject"() {
        given: //sekcja w której np. mokowanie objektów, inicjalizujemy zmienne lokalne dla przypadku testowego
        //sekcja given jest sekcją nieobowiązkową

        when: //sekcja w której wykonujemy nasz przypadek testowy i zazwyczaj powinniśmy deklarować
        //w tym miejscu parametr, który będzie naszym wynikiem

        def result = "test"

        then: //sekcja w której weryfikujemy nasze założenia w ramach przypadku testowego
        noExceptionThrown() // metoda którą stosuję zawsze, jeśli mój przypadek testowy nie powinien rzucać Exception'a
        result == "test"
        /*
        where: //sekcja w której będziemy deklarowali wiele parametrów wejściowych oraz przewidywane ich wyniki
-----------------------------------------
        struktura:
        where:
       parametr1 | parametr2 || wynik
       1241      | 151361    || 988651
         */
    }

    def "Przykład nie związany z obiektem Karta"() {
        given:

        def zmienna1 = 2
        def zmienna2 = 5

        when:

        def result = zmienna1 + zmienna2 // zwróci nam Integer
        printf(result as String)  // printf() metoda która ma za zadanie wyświetlanie wartości na konsolę
        //result as String -> przez określenie as String mówimy że nasz wynik ma być cast'owany na String

        then:
        noExceptionThrown()
        result != null
        result == 7
    }

    @Unroll
    //adnotacja, której używamy zwykle przy tworzeniu testów z wykorzystaniem where
    //pozwala ona na rozbicie (w oknie 'Run') przypadku testowego na oddzielne testy
    def "Przykład nie związany z obiektem Karta z wykorzystaniem where"() {
        when:

        def result = zmienna1 + zmienna2

        then:
        noExceptionThrown()
        result == expectedResult

        where:
        zmienna1 | zmienna2 || expectedResult
        1        | 1        || 2
        10       | 100      || 110
        -10      | 10       || 0
        -100     | -100     || -200
    }

    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować jego parametry"() {
        when:

        def result = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        then:
        noExceptionThrown()
        result != null
        result.nrKarty == nrKartyStub
        result.pinKarty == pinKartyStub
        result.saldo == saldoStub
    }

    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin. Happy Path"() {
        given:
        def pinFromUser = 1234
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.sprawdzNrPin(pinFromUser)

        then:
        noExceptionThrown()
    }

    def "Powinien prawidłowo utworzyć object Karta przez konstruktor oraz zweryfikować czy użytkownik podał prawidłowo nr Pin. not Happy Path"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.sprawdzNrPin(pinFromUser)

        then:
        def err = thrown(expected)
        err.message == expectedMessage

        where:
        pinFromUser || expected       | expectedMessage
        8888        || KartaException | "Niepoprawny pin dla karty."
        9999        || KartaException | "Niepoprawny pin dla karty."
        1010        || KartaException | "Niepoprawny pin dla karty."
        7567        || KartaException | "Niepoprawny pin dla karty."
    }

    def "Powinno wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == saldoStub
    }

    def "Powinno wpłacić oraz wypłacić gotówkę następnie wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.wplacGotowke(100)
        underTest.wyplacGotowke(100)
        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == saldoStub
    }

    def "Powinno wpłacić gotówkę następnie wyświetlić saldo karty"() {
        given:
        underTest = new Karta(nrKartyStub, pinKartyStub, saldoStub)

        when:

        underTest.wplacGotowke(100)
        def result = underTest.stanKonta()

        then:
        noExceptionThrown()
        result == 100
    }
}