package pl.cyber.trainees.pracaDomowa1607;


public class Model1 extends Auto {

    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Color color;

    public Model1() {
        super();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.color = null;
    }

    public Model1(
            String marka, String rocznik,
            String naped, String nazwa,
            Integer przebieg,
            Double pojemnoscSilnika,
            Color color) {

        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Marka: " + getMarka()
                + " rocznik: " + getRocznik()
                + " naped: " + getNaped()
                + " nazwa modelu: " + this.nazwa
                + " przebieg: " + this.przebieg
                + " pojemnosc silnika: " + this.pojemnoscSilnika
                + " kolor: " + this.color;
    }
    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
    public Integer getPrzebieg() {
        return przebieg;
    }
    public Color getColor() {
        return color;
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
    public void setColor(final Color color){
        this.color = color;


    }
}
