package zadaniaDomowe.wyrazeniaRegularne;

import javafx.css.converter.StringConverter;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String imie = "123123";

        Pattern sprawdz = Pattern.compile("1234142");
        Matcher porownaj = sprawdz.matcher("123");

        System.out.println(porownaj.find());
        System.out.println(porownaj.matches());

        System.out.println(sprawdzCzyLiczby(imie));

        //zadanie2
        String zdanie = "Ala ma kota";
        System.out.println("Podaj co mam usunąć ze zdania: Ala ma kota");
        String noweImie = scanner.nextLine();
        zmienWyraz(noweImie, zdanie);

        System.out.println("Teraz zdanie to " +zdanie);


        //zad3
        String nowosc = usunSpacje(noweImie);
        System.out.println("Twoje zdanie bez spacji :\n "+ nowosc);
//        String nowy = "asas";
//        String jakisWyraz = "Adasdqw";
//        String nowyWyraz = "Jestem nowiutkimWyrazem";
//
//        nowy.replaceAll(jakisWyraz,nowyWyraz);
//
//        System.out.println(nowy);

        //zad 4


        System.out.println(checkWordOnlyLetterAnd5Long("Zdani"));

    }

    //zad1
    public static boolean sprawdzCzyLiczby(String napis) {
        Pattern sprawdz = Pattern.compile("[0-9]+");
        Matcher porownaj = sprawdz.matcher(napis);

        if (porownaj.matches()) {
            return true;
        } else {
            return false;

        }




    }

    public static boolean checkWordOnlyLetterAnd5Long(String wordChecked) {

            Pattern checkRegex = Pattern.compile("[A-Za-z]{5}");
            Matcher regexMatcher = checkRegex.matcher(wordChecked);
            return regexMatcher.matches();
        }





    public static String zmienWyraz(String staryWyraz, String wyrazUzytkownika){

        Pattern pattern = Pattern.compile(staryWyraz);
        Matcher matcher = pattern.matcher(wyrazUzytkownika);
        return matcher.replaceAll(staryWyraz);
    }

    public static String usunSpacje(String zdanie){
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(zdanie);
        return matcher.replaceAll(" ");
    }
}


