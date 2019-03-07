package streamStrumienieZadanie3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Utwórz kolekcję, na następnie dodaj do niej 5 imion.
// Korzystając z Stream zmodyfikujkolekcję tak,
// aby imiona były pisane dużymi literami (UPPERCASE),
// a następniewyświetl wszystkie imiona

public class Main {
    public static void main(String[] args) {
        List<String> listaNazw = Arrays.asList("Anna", "Tomek", "Marcin", "Lukasz", "Alan", "Mikolaj", "Piotr", "Nikodem", "Maks");
        List<String> result = new ArrayList<>();

        List<String> collect = listaNazw.stream().limit(5).collect(Collectors.toList());
        System.out.println("Result: " + Arrays.toString(listaNazw.toArray()));

         listaNazw.add("Marcin");
        listaNazw.add("Marcin");
        listaNazw.add("Marcin");

       result =  listaNazw.stream().map(duze -> duze.toUpperCase()).collect(Collectors.toList());
        System.out.println("duze lister plus 5 imin" + Arrays.toString(result.toArray()));

//  collect(Collectors.toList()); - torzy liste na nowo

    }
}
