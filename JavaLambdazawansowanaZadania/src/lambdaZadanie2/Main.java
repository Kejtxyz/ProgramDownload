package lambdaZadanie2;
//   Utwórz klasę Point zawierającą zmienne int x oraz int y. Dodaj 10 punktów do listy
//List<Point>. Korzystając ze strumieni posortuj punkty według współrzędnej x i
//wyświetl posortowaną tablicę.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main(){
public static void main(String[]args){

        List<Point> listxy = new Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        listxy.stream().sorted().collect(Collectors.toList());
        System.out.println(" lista posortowana wedlug x : "+listxy);
        }
}


