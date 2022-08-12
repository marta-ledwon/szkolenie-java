package pl.cyber.trainees.wyjaśnienia;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mariusz Tański
 */

public class Obiekty {

    private void wyswietlTalkDTO() {
        List<String> list = new ArrayList<>();
        list.add("przyklad1");

        TalkDTO talkDTO = new TalkDTO("Obiektowsc", "Operacje na obiektach", list);
//    System.out.println(talkDTO.toString());
//    System.out.println("Dziś zajmujemy się tematem: " + talkDTO.getTematRozmowy());

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.opis);

        talkDTO.opis = "";

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        talkDTO.setOpis("12314521");

        System.out.println(talkDTO.getTematRozmowy());
        System.out.println(talkDTO.getOpis());

        System.out.println(talkDTO.getPrzyklady());

        List<String> wiecej = new ArrayList<>();
        wiecej.add("przyklad2");
        wiecej.add("przyklad3");

        talkDTO.modifyList(wiecej);

        System.out.println(talkDTO.getPrzyklady());
//    talkDTO.setPrzyklady();

    }

    public void uruchom() {
        wyswietlTalkDTO();
    }
}