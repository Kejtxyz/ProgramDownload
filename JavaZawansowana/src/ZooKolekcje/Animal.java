package ZooKolekcje;

abstract class Animal {
    private String name;



    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    void sayHi(){
        System.out.println("Hello , my name is "+ name);

    }
}

// kazde ziwerze w swoj sposob je inny pokarm i w innych ilosciach,
//klasa abstract -abstrakcyjna,
