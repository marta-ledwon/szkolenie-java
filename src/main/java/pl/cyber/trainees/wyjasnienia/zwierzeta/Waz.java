package pl.cyber.trainees.wyjasnienia.zwierzeta;
import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;


public class Waz extends Zwierze {
    private final String imie;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Waz() {
        super(null, false);
        imie = "";
        dataUrodzenia = LocalDate.now();
    }

    public Waz(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia, final Double waga,
               final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }


    public String przedstawSie() {
        return "Jestem Wąż. Moje imie: " + this.imie + ", Moja data ur.: " + this.dataUrodzenia +
                ", waga: " + this.waga + ", opiekun: " + this.imieOpiekuna;
    }
    @Override
    public String dajGlos() {
        return "Syk";
    }

    public Waz convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Waz(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }
}