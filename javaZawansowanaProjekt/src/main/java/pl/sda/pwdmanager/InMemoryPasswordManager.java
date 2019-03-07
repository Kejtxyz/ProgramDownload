package pl.sda.pwdmanager;

import java.util.Collection;

public class InMemoryPasswordManager extends PasswordManager {

    @Override // zapisalo dotychczas wygenerowane hasla
    public void persist() {

    }

    @Override  // zczytuje hasla
    public Collection<String> read() {
     return generetedPasswords;

    }
}
