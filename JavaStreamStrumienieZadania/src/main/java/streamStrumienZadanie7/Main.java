package streamStrumienZadanie7;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Utwórz kolekcję z 10 imionami (W kolekcji musi pojawić się imię Jan).
// Korzystając ze strumieni znajdź imię Jan i wyświetl je
public class Main {
    public static void main(String[] args) {
        List<String>  namelist = Arrays.asList("Anna","Michal","Jan","Kuba","Filip","Mateusz","Rafal","Marta","Kasia","Jacek");

// findAny - optional,
   Optional<String> result2 = namelist.stream().filter(name -> name.equals("Jan")).findAny();
        System.out.println(" Znalazl imie Jan i wyswietlil je : " + result2.get());

    }
}
