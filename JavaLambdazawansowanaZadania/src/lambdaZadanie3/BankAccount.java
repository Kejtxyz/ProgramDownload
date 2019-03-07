package lambdaZadanie3;

import java.util.Arrays;
import java.util.List;

public class BankAccount {

    public static void main(String[] args) {
        List<BankAccount> listaosob = Arrays.asList(String imie, String nazwisko, Double konto);
         listaosob.add("Karol","Kowalski","2000");
        listaosob.add("Michal","Napierala","1400");
        listaosob.add("Alan","Precyzyjny","4000");


        listaosob.stream().sorted();
        System.out.println(listaosob);

    }



    public BankAccount() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Osoby{}";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
