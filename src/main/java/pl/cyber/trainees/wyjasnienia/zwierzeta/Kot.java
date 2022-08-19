package pl.cyber.trainees.wyjasnienia.zwierzeta;
import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;


public class Kot extends Zwierze {
    /*
     imię (ciąg znaków) [String]
      data urodzenia (data) [LocalDate]
      waga (liczba zmiennoprzecinkowa) [Double / BigDecimal]
      imię opiekuna (ciąg znaków) [String]
     */
    private final String imieKota;
    private final LocalDate dataUrodzenia;
    private Double waga;
    private String imieOpiekuna;

    public Kot() {
        super(0.0, true);
        imieKota = "";
        dataUrodzenia = null;
    }

    public Kot(
            final String imieKota, final LocalDate dataUrodzenia,
            final Double waga, final String imieOpiekuna) {
        super(0.0, true);
        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Kot(final Double wzrost, final boolean czyMaSiersc,
               final String imieKota, final LocalDate dataUrodzenia, final Double waga,
               final String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imieKota = imieKota;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImieKota() {
        return imieKota;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Double getWaga() {
        return waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public String przedstawSie() {
        return "Jestem kot. Moje imie: " + this.imieKota + ", Moja data ur.: " + this.dataUrodzenia +
                ", waga: " + this.waga + ", opiekun: " + this.imieOpiekuna;
    }

    @Override
    public String dajGlos() {
        return "Miauuuu";
    }

    public Kot convertFromFile(String rowInFile) {
        String[] tablicaPliku = rowInFile.split(",");
        DateConverter dateConverter = new DateConverter();
        LocalDate dataUrodzenia = null;
        try {
            dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return new Kot(
                Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]
        );
    }
}