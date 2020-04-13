package zadaniaDomowe.obiektowosc;

import java.util.Scanner;

public class Figury {


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat();
        Trojkat trojkat = new Trojkat();
        Kwadrat kwadrat = new Kwadrat();
        MetodaKola wzorNaPoleKola = new MetodaKola();
        System.out.println("Podaj możliwy promień koła, którego chcesz znać pole" );
        int promien = scanner.nextInt();

        System.out.println("Pole Koła wynosi " + wzorNaPoleKola.poleKola(promien));


        System.out.println("podaj wysokość prostokąta");
        double h = scanner.nextDouble();
        System.out.println("podaj podstawę prostokąta");
        double c = scanner.nextDouble();

        System.out.println("pole prostokąta wynosi "+ trojkat.poleProstokata(c,h));


        System.out.println("podaj bok kwadratu");
        double a = scanner.nextDouble();

        System.out.println("Pole kwadratu wynosi "+ kwadrat.poleKwadratu(a));

        System.out.println("Podaj pierwszy bok prostokąta ");
        double aProstokata = scanner.nextDouble();
        System.out.println("Podaj drugi bok prostokąta ");
        double bProstokata = scanner.nextDouble();

        System.out.println("Pole prostokąta wynosi: "+ prostokat.poleProstokata(aProstokata,bProstokata));
    }





}
