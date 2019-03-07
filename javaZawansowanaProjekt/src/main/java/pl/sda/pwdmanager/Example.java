package pl.sda.pwdmanager;

import java.nio.file.Paths;

public class Example {
    public static void main(String[] args) {
        PasswordManager passwordManager = createPwdManager();

        for (int i = 0; i < 10; i++) {
            passwordManager.generatePassword(10);
        }

        passwordManager.persist();

        passwordManager.read().forEach(System.out::println);  //
    }

    private static PasswordManager createPwdManager() {
//        return new TextFilePasswordManager(
//                Paths.get("files", "password.txt"),
//                Charset.forName("UTF-8"));
        return new JsonPasswordManager(Paths.get("files", "passwords.json"));
    }
}
