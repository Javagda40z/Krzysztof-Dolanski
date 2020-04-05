package obiekty2;

import obiekty.Animal;
import obiekty.Cat;
import obiekty.Dog;
import obiekty.Vet;

public class Vet2 {

    public void sayHello(Animal2 zwierze) {

        System.out.println("witaj " + zwierze.getImie());
    }



    public static void main(String[] args) {

        Animal2 kot  = new Cat2("kiziamizia");
        Animal2 pies = new Dog2("bureek");
        Animal2 chomiczek = new Hamster("sad");

        Vet2 weterynarz2 = new Vet2();

        weterynarz2.sayHello(pies);
        weterynarz2.sayHello(kot);
        weterynarz2.sayHello(chomiczek);
    }
}
