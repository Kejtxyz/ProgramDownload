package Zajecia2dziedziczenie;

public class Parrot extends Animal {

    public Parrot() {
        super("Polly");
    }

    public Parrot(String name) {
        super(name);
    }


    @Override
    public void move() {
        System.out.println("Parrot flaying");
    }

    public void talk() {
        System.out.println("parrot talk");

    }


}
