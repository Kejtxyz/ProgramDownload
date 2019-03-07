public class Test1{
    public static void main(String[] args){
        double liczba = 1;
        liczba = 0;
        int b = 2;
        b = 0;
        double pierwiastek = Math.sqrt(liczba);
        double potega = Math.pow(liczba, b);

        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
        System.out.println("Liczba "+liczba+" podniesiona do potegi "+b+" to "+potega);
    }
}