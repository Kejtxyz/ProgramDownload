package pl.sda.pwdmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// generuje hasla
public abstract class PasswordManager {
    protected List<String> generetedPasswords = new ArrayList<>();

    public String generatePassword(int lengthPassword) {
        Random random = new Random();  // klasa sluzaca do generowania losowych liczb
        String password = random.ints(65, 123)  // generowanie liczb // podajemy zakres liczb
                .limit(lengthPassword)
                .mapToObj(number -> String.valueOf((char) number))  // bierzemy number z zakresu znakow ascii
                // string stringow // przeksztalca numery na znaki ascii  // rzutowanie
                .collect(Collectors.joining()); // tworzymy stream, i ograniczamy jego dlugosc,rozdizelenie liczb
        generetedPasswords.add(password);
        return password;
    }

    public abstract void persist();


    public abstract Collection<String> read();
}


