package streamStrumienZad1;
///Utwórz kolekcję typu List<String> 10 dowolnych napisów a następnie korzystając z
//Stream i operacji forEach wyświetl wszystkie napisy znajdujące się w kolekcji.
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// zad1, utworz kolekcje typu list,string.stream,foreach
public class Main {
    public static void main(String[] args) {
        List<String> listaNazw = Arrays.asList("Anna", "Tomek","Marcin","Lukasz","Alan","Mikolaj","Piotr","Nikodem","Maks");
        List<Integer> result = new ArrayList<>();

     listaNazw.stream()
                .forEach( imie -> System.out.println(imie));  // lambda
// wyprowadzenie na ekran
        System.out.println("Result: " + Arrays.toString(listaNazw.toArray()));
    }
}
