package obiekty;

public class Car implements Movable, Animal{


    @Override
    public void move() {
        System.out.println("Jade");
    }
    @Override
    public void makeSound() {
        System.out.println("brumm!");
    }

}
