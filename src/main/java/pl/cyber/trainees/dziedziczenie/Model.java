package pl.cyber.trainees.dziedziczenie;

import java.util.ArrayList;
import java.util.List;

//extends - słowo kluczowe stosowane przy dziedziczeniu klas
public class Model extends Pojazd{

    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;

    public Model() {
        super();// to określa konstruktor, który wybierzemy z naszej klasy Pojazd
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor = null;
    }

    public Model(
            String marka, String rocznik,
            String naped, String nazwa,
            Integer przebieg,
            Double pojemnoscSilnika,
            Kolor kolor) {

        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }
    @Override // adnotacja wykorzystywana do przysłaniania metod
    public String toString() {
        return "Marka: " + getMarka()
                + " rocznik: " + getRocznik()
                + " naped: " + getNaped()
                + " nazwa modelu: " + this.nazwa
                + " przebieg: " + this.przebieg
                + " pojemnosc silnika: " + this.pojemnoscSilnika
                + " kolor: " + this.kolor;
    }
    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public Integer getPrzebieg() {
        return przebieg;
    }
    public Kolor getKolor() {
        return kolor;
    }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(final String nazwa){
        this.nazwa = nazwa;
    }
    public void setPrzebieg(final Integer przebieg){
        this.przebieg = przebieg;
    }
    public void setPojemnoscSilnika(final Double pojemnoscSilnika){
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
    public void setKolor(final Kolor kolor){
        this.kolor = kolor;


    }
}
