package zadania;

public class Zadania {
    public static void main(String[] args) {


        Zadania zadania = new Zadania();
        zadania.tabliczkaMnozenia(5);

    }

    public void tabliczkaMnozenia(int liczba){

        System.out.println("tabliczka mnożenia liczby: "+liczba);
        for (int i = 1; i <= 5; i++) {
            System.out.println(liczba + " x " + i + " = " + liczba*i);
        }
    }
}
