package pl.cyber.trainees.pracaDomowa1607;

public class Auto {
    private String marka;
    private String rocznik;
    private String naped;

    public Auto() {
        marka = "";
        rocznik = "";
        naped = "";
    }

    //Alt+Fn+Insert = menu kontekstowe do generowania kodu CONSTRUCTOR
    public Auto(String marka, String rocznik, String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    public String toString() {
        return "Marka: " + this.marka
                + " rocznik: " + this.rocznik
                + " naped: " + this.naped;
    }


    public String getMarka() {
        return marka;
    }

    public String getRocznik() {
        return rocznik;
    }

    public String getNaped() {
        return naped;
    }



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
