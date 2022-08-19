package pl.cyber.trainees.wyjasnienia.zwierzeta;


public class Zwierze {

    private final Double wzrost;
    private final boolean czyMaSiersc;


    public Zwierze(final Double wzrost, final boolean czyMaSiersc) {
        this.wzrost = wzrost;
        this.czyMaSiersc = czyMaSiersc;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public boolean isCzyMaSiersc() {
        return czyMaSiersc;
    }

    public String dajGlos() {
        return "";
    }

    public String dajGlos2() {
        return "";
    }
}
