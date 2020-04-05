package obiekty;

public class Vet {

    public void sayHello(Cat cat){

        System.out.println("witaj "+ cat.getImie());
    }

    public void sayHello(Dog dog){
        System.out.println("witaj "+ dog.getImie());
    }




    public static void main(String[] args) {
        Cat kotek = new Cat("teofil");
        Dog piesek = new Dog("bramka");
        Vet weterynarz = new Vet();
        weterynarz.sayHello(kotek);
        weterynarz.sayHello(piesek);
    }
}
