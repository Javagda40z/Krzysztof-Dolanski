package obiekty;

public class Cow implements Animal{

    public void dajMleko(){
        //krowy dają mleko
    }

    @Override
    public void makeSound() {
        System.out.println("muuu");
    }

    @Override
    public void move() {
        System.out.println("biegne z kopyta");
    }



}

