package Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
     //   Main m = new Main(m.hashCode());
     //   System.out.println(m.hashCode());
        // deklaracja listy
        List<String> names = new ArrayList<>();
        // dodawanie elementow do listy
        names.add("Adam");
        names.add("Marta");
        names.add("Kasia");
        names.add("Oliwka");
        // odczyt lelementu z listy
        names.get(1);
        System.out.println(names.get(1));

        // modyfikacja elementu z listy
        names.set(1,"Janussz");   // nadpisuje janusz na jan , na pierwsze pozycji
        System.out.println(names.set(1));

        //   usuwanie wartosci
        names.remove("Janusz");
        System.out.println(names);

        // conteins - sprawdzaanie wystapienia wartosci
        System.out.println(names.contains("Ola"));

        // sprawdzenie , zwrot , wypisanie dlugosci listy
        System.out.println(names.size());

        //   na jakim indeksie znajduje sie jakas wartosc
        System.out.println("Indeks Oli : " + names.indexOf("Ola"));


        //  Utworzenie obiektu listy z zainicjalizowanymi wartosciami
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(numbers);





        /**
         * KOlekcje
         *
         *
         *
         *
         * **/
    }
}
