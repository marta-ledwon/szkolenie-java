package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;


public class Papuga extends Zwierze {
    private final String imie;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Papuga() {
        super(null, false);
        imie = "";
        dataUrodzenia = LocalDate.now();
    }

    public Papuga(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia, final Double waga,
                  final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }


    public String przedstawSie() {
        return "Jestem Papuga. Moje imie: " + this.imie + ", Moja data ur.: " + this.dataUrodzenia +
                ", waga: " + this.waga + ", opiekun: " + this.imieOpiekuna;
    }
    @Override
    public String dajGlos() {
        return "Ara";
    }

    public Papuga convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Papuga(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }
}