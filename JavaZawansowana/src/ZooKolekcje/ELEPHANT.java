package ZooKolekcje;

public class ELEPHANT extends Animal {
    ELEPHANT(String name){
        super(name);
    }


    ELEPHANT(){
        super("Babar");
    }

    @Override
    void eat() {
        System.out.println("Elephant eats");
    }

    void makeASound(){


    }
}
