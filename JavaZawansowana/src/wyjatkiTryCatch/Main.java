package wyjatkiTryCatch;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate.add(2,5));
            calculate.add(-1,5);
        try{
            calculate.add(-1,5);

        }
        catch (IllegalArgumentException e){
            System.out.println("Ädding -1 and 5 failed");
        }
        try{
            calculate.add(2,2);
        }
        catch (IllegalArgumentException e){
            System.out.println("Ädding -2 and 2 failed");
        }
        calculate.add(2,-2);

    }
}
