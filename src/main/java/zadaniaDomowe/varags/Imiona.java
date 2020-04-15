package zadaniaDomowe.varags;

public class Imiona {
    public static void main(String[] args) {

        String imionaWszystkie = wypiszImiona("Adam", "Arek", "Marek", "Beata", "Basia", "Justyna", "Eliza");

        System.out.println(imionaWszystkie);
    }

    public static String wypiszImiona (String... imiona){

        String imie = null;
        for (String i: imiona) {
            imie = i + ", " + imie;
        }

        return imie;


    }
}
