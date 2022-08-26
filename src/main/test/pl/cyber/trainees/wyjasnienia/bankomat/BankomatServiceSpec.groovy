package pl.cyber.trainees.wyjasnienia.bankomat


import spock.lang.Specification


class BankomatServiceSpec extends Specification {

    private BankomatService underTest = new BankomatService()
    private Scanner scanner = Mock()

    def "Sprawdzam wybraną pozycję nr 0 tj. Przerwij operacje"() {
        when:

        def result = underTest.menu2(0, null)

        then:
        noExceptionThrown()
//        result == false
        !result

    }

}