package obiekty;

public class Cat implements Animal{

    private int licznikZlapanychMyszy = 0;
    public void drap(){
        //kot drapie
    }



    private String imie;

    public Cat(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
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

    @Override
    public void move() {
        System.out.println("biegnę na łapkach kocich");
    }
}
