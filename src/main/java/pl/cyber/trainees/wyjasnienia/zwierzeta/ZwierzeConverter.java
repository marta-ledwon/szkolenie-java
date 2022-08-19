package pl.cyber.trainees.wyjasnienia.zwierzeta;

import pl.cyber.trainees.wyjasnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;


public class ZwierzeConverter {
    public Kot convertKotFromFile(String rowInFile) {
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

    public Pies convertPiesFromFile(String rowInFile) {
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