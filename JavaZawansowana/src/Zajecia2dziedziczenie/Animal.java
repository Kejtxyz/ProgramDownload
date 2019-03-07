package Zajecia2dziedziczenie;

public class Animal {
    public void  eat(){
        System.out.println("eat cos");
    }

    public void move(){
        System.out.println("move cos");
    }

    public Animal(String name) {
        this.name = name;
    }

    protected String name ;




}
