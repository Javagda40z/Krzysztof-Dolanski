package pozostale;

import java.util.Scanner;

public class RysowanieProstokatu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj bok a");
        int bokA = scanner.nextInt();
        System.out.println("podaj bok b");
        int bokB = scanner.nextInt();

        int i = 0;
        while (i<bokB) {

            char znaczek = '*';
            for (int z = 0; z < bokA; z++) {
                System.out.print(znaczek);
            }
            System.out.println();
            i++;
        }
    }
}
