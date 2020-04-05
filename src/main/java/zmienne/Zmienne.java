package zmienne;

public class Zmienne {
    public static void main(String[] args) {

        int pierwsza = 123;
        double druga = 1231.23;
        float trzecia = 2133f;


        System.out.println(pierwsza + " " + druga + " " + trzecia);


        double nowa = pierwsza * druga;

        System.out.println(nowa);


        double pi = 3.17;

        int i = (int) pi;

        System.out.println(dodaj(4,7));

    }
        public static int dodaj(int a, int b){

            return a+b;
        }
        public static int odejmij(int a, int b){

            return a-b;
        }
        public static int pomnoz(int a, int b){

            return a*b;
        }
        public static int podziel(int a, int b){

            return a/b;
        }

        public static boolean czyParzysta(int a){
        return (a%2 == 0);
        }



    }

