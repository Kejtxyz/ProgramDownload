package ZooKolekcje;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new ELEPHANT(":Adam"));
        zoo.add(new Parrot("Perro"));
        zoo.feed();
        System.out.println(zoo.countAllAnimals());
    }

}
