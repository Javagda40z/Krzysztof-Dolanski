package obiekty;

public class TestyNaKotach {
    public static void main(String[] args) {

        Cat kot = new Cat();

        System.out.println(kot.getLicznikZlapanychMyszy());
        kot.eatMouse();
        kot.eatMouse();
        kot.eatMouse();
        kot.eatMouse();
        System.out.println(kot.getLicznikZlapanychMyszy());

        if (powinienDostacMleko(kot)){
            System.out.println("daje mleko");
        }else {
            System.out.println("za mało myszy");
        }

    }


    public static boolean powinienDostacMleko(Cat cat){

        if(cat.getLicznikZlapanychMyszy()>10){
            return true;
        } else {
            return false;
        }


    }
}
