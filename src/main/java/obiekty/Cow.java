package obiekty;

public class Cow implements Animal{

    public void dajMleko(){
        //krowy dają mleko
    }

    @Override
    public void makeSound() {
        System.out.println("muuu");
    }
}
