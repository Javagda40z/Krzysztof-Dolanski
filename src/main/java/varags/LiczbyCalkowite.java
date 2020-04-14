package varags;

public class LiczbyCalkowite {
    public static void main(String[] args) {


        int n = 300;

        int result = suma(1,3,4,6);
        System.out.println(result);


    }

    public static int suma(int... liczby){
        int sum = 0;
        for (int i: liczby) {
            sum = i+sum;
        }
        return sum;

    }
}
