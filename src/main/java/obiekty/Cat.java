package obiekty;

public class Cat implements Animal{

    int licznikZlapanychMyszy = 0;
    public void drap(){
        //kot drapie
    }

    public void eatMouse(){

        //kot wpierdala mysz
        licznikZlapanychMyszy++;
        System.out.println("zjadłem " + licznikZlapanychMyszy +" myszy i jednego szczura");
    }

    @Override
    public void makeSound() {
        System.out.println("miauuuaełełełełłłłłłłuuu!");
    }

    public int getLicznikZlapanychMyszy() {
        return licznikZlapanychMyszy ;
    }
}
