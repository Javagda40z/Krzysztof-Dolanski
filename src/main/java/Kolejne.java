import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kolejne {

    public static void main(String[] args) {



    }


    int r = 3;

    List<Integer> lista = new ArrayList<>();
    ArrayList<Integer> lista2 = new ArrayList<>();




    public List<Integer> ciagArytmetyczny(int dlugosc, int pierwszy, int roznica) {



        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i <dlugosc ; i++) {
            ciag.add(pierwszy + i*roznica);
        }
        return ciag;






    }



    }

