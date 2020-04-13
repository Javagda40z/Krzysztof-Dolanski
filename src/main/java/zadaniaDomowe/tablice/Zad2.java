package zadaniaDomowe.tablice;

import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {


        Zad1 tablica = new Zad1();


        int suma = 0;
        int suma2 = 0;
        long mnozenie1 = 1;
        long mnozenie2 = 1;
        for (int i = 0; i <tablica.tab.length ; i++) {
           suma = suma + tablica.tab[i];
        }



        //zadanie 3
        Arrays.sort(tablica.tab);
        int x =tablica.tab[0];
        System.out.println("najmniejsza " + x);
        int z =tablica.tab[tablica.tab.length-1];
        System.out.println("największy " + z);

        //zadanie 5
        for (int i = 0; i <tablica.tab2.length ; i++) {
            suma2 = suma2 + tablica.tab2[i];
        }
        System.out.println("suma2 tablic: " + Math.addExact(suma,suma2));

        //zadanie 6

        for (int i = 0; i <tablica.tab.length ; i++) {
            mnozenie1 = mnozenie1 * (long) tablica.tab[i];
        }

        for (int i = 0; i <tablica.tab2.length ; i++) {
            mnozenie2 = mnozenie2 * (long) tablica.tab[i];
        }

        System.out.println("iloraz elementow dwoch tablic: "  +  (Math.multiplyExact((long) mnozenie1, mnozenie2)));


        //zadanie 7.1
        System.out.println(Arrays.toString(tablica.tab3) + " rozmiar "+ tablica.tab.length);

        //zadanie 7.2
                   tablica.tab3[0] = "piotr";
        System.out.println(Arrays.toString(tablica.tab3));

        //zadanie 7.3
                           // Wypisz tablicę tak aby imiona zaczynały się od dużej litery
        //w zadaniu nie było mowy o tym że pozostałe litery mają być małą :)
        System.out.println(Arrays.toString(tablica.tab3).toUpperCase());

        //zadanie 7.4
        tablica.tab3[2] = null;
        //tablice nie są zmniejszalne ani rozszerzalne przez kompilator
        System.out.println(tablica.tab3.length);

        //zadanie 2
        System.out.println("średnia "+ (suma/tablica.tab.length));

        //zadanie 8

        int tab4[] = new int[16];
        System.arraycopy(tablica.tab, 0, tab4, 0, 8);
        System.arraycopy(tablica.tab2, 0, tab4, 8,8);

        System.out.println("Zmieniona tablica " + Arrays.toString(tab4));
      /*  for (int i = 0; i < tablica.tab.length; i++) {

            int [] nowaTablica = new int[]{tablica.tab[i], tablica.tab2[i]};
            nowaTablica [i] = nowaTablica [i*2];
            System.out.print(Arrays.toString(nowaTablica));
        }*/




//        System.out.println(tablica.tab[0]+ tablica.tab[1]+tablica.tab[2]+tablica.tab[3]+tablica.tab[4]+
//                tablica.tab[5]+tablica.tab[6]+tablica.tab[7]);
//        int ilosc = tablica.tab.length;
//
//        System.out.println(ilosc);
////        System.out.println(Zadanie2.sumOfTableElements(tablica.tab));
//        System.out.println(Arrays.toString(Zadanie2.sumaElementow(tablica.tab)));
//    }

//    public static int sumOfTableElements(int[] tab) {
//        for (int i = 0; i < tab.length; i++) {
//            int z;
//            z = tab[i];
//            int sum = z + tab[i];
//            return sum;
//        }
//        return 0;


//    }
//    public static int[] sumaElementow(int[] tab){
//        for (int i = 0; i <tab.length ; i++) {
//
//            tab = ArrayUtils.add(tab,i);
//        }
//        return tab;
//    }
//    }

    }



    }











