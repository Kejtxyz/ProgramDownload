package pl.sda.pwdmanager;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

public class TextFilePasswordManager extends PasswordManager {


    private Path pathtofile;
    private Charset charset;

    public TextFilePasswordManager(Path pathtofile, Charset charset) {
        this.pathtofile = pathtofile;
        this.charset = charset;
    }

    @Override
    public void persist() {
        try {
            Files.write(pathtofile, generetedPasswords, charset);
        } catch (IOException e) {
            throw new RuntimeException(
                    String.format(
                            "Failed to persist generated passwords. Cannot write to the passwords file: %s.", pathtofile),
                    e);
        }
    }

    @Override
    public Collection<String> read() {
        try {
            return Files.readAllLines(pathtofile, charset);
        } catch (IOException e) {
            throw new RuntimeException(
                    String.format(
                            "Failed to  read passwords from file %s ", pathtofile),
                    e);
        }
    }
}
