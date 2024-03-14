package de.lubowiecki.playground.vererbung;

import java.time.LocalDate;
import static de.lubowiecki.playground.vererbung.UI.*;

public class UiTest {

    public static void main(String[] args) {

        System.out.println(UI.HELP);

        LocalDate heute = LocalDate.now();
        System.out.println(heute.format(UI.DATE_FMT));
        System.out.println(heute.format(DATE_FMT));

        printFormatedDate(heute); // statische Methode wurde mit dem statischen Import eingebunden

    }
}
