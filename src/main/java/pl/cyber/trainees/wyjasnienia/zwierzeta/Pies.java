package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;

/**
 * @author Mariusz Tański
 */

public class Pies extends Zwierze {
    private final String imiePsa;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Pies() {
        super(null, false);
        imiePsa = "";
        dataUrodzenia = LocalDate.now();
    }

    public Pies(final Double wzrost, final boolean czyMaSiersc, final String imiePsa, final LocalDate dataUrodzenia, final Double waga,
                final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imiePsa = imiePsa;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }


    public String przedstawSie() {
        return "Jestem Pies. Moje imie: " + this.imiePsa + ", Moja data ur.: " + this.dataUrodzenia +
                ", waga: " + this.waga + ", opiekun: " + this.imieOpiekuna;
    }
    @Override
    public String dajGlos() {
        return "Hałł";
    }

    public Pies convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Pies(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }
}