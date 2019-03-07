package pl.sda.pwdmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class PasswordHolder {
    private Collection<String> passwords;

    public PasswordHolder() {
        passwords = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordHolder that = (PasswordHolder) o;
        return Objects.equals(passwords, that.passwords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwords);
    }

    public Collection<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(Collection<String> passwords) {
        this.passwords = passwords;
    }
}
