import zadanie2.Eanglish;
import zadanie2.Language;
import zadanie2.Polish;
import zadanie2.Zadanie2;
import zadanie3.Kadry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Zadanie1 zadanie = new Zadanie1();
//        zadanie.execute();

        Zadanie2 zadanie2 = new Zadanie2();
        Eanglish eanglish = new Eanglish();
        Polish polish = new Polish();
        Language[] languages = new Language[2];
        languages[0] = polish;
        languages[1] = eanglish;
        zadanie2.execute(languages);

    }
}