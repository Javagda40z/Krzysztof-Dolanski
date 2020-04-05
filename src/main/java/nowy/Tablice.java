package nowy;

import org.apache.commons.lang3.ArrayUtils;

import java.sql.Array;
import java.util.Arrays;
import java.util.SortedMap;

public class Tablice {

    public static void main(String[] args) {
        int[] tablica = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(tablica));
        zamienPierwszyiTrzeciElement(tablica);
        System.out.println(Arrays.toString(tablica));

        int[] nieposortowanaTablica = new int[]{1, 4, 4, 2, 23, 2};
        System.out.println(Arrays.toString(nieposortowanaTablica));
        Arrays.sort(nieposortowanaTablica);
        System.out.println(Arrays.toString(nieposortowanaTablica));
    }

    public static void zamienPierwszyiTrzeciElement(int[] tablica) {
        int i = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = i;

        int[] tablica2 = new int[]{3, 4, 5, 6, 7, 3241};

        Arrays.sort(tablica2);


        int x = tablica2[0];
        System.out.println(x);

        int[] tab = new int[]{23, 234, -234, -212, -33};


        int[] tablicaminusy = new int[tab.length];
        int ilscMinusowych = 0;
        int iteracja = 0;


        System.out.println("tu " +Arrays.toString(policzUjemne(tab)));

    }
    public static int [] policzUjemne (int[] tab){
        for (int i :tab ){
           tab = ArrayUtils.add(tab, i);
        }
        return tab;
    }
}