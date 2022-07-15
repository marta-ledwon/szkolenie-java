package pl.cyber.trainees.dziedziczenie;


// nowa klasa określająca markę pojazdu

public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";
    }

    //Alt+Fn+Insert = menu kontekstowe do generowania kodu CONSTRUCTOR
    public Pojazd(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    public String toString() {
        return "Marka: " + this.marka
                + " rocznik: " + this.rocznik
                + " naped: " + this.naped;
    }
    //GETTERY - metody, których zadaniem jest pobieranie informacji z pól klasy
    // do dalszego przetwarzania

    public String getMarka() {
        return marka;
    }

    public String getRocznik() {
        return rocznik;
    }

    public String getNaped() {
        return naped;
    }


    //Settery - metody, któych zadaniem jest ustawianie informacji z parametru metody do parametru klasy

    public void setMarka(final String marka){
        this.marka = marka;
}
    public void setRocznik(final String rocznik){
        this.rocznik = rocznik;
    }
    public void setNaped(final String naped){
        this.naped = naped;
    }
}
