package pl.sda.pwdmanager;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalProgrammingExample {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("hello", "hello2", "hello3");

        strings
                .stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
