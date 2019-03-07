package pl.sda.pwdmanager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;

public class JsonPasswordManager extends PasswordManager {

    private Path pathToJsonFile;
    private ObjectMapper objectMapper;

    public JsonPasswordManager(Path pathToJsonFile) {
        this.pathToJsonFile = pathToJsonFile;
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Override
    public void persist() {
        PasswordHolder passwordHolder = new PasswordHolder();
        passwordHolder.setPasswords(generetedPasswords);
        try {
            objectMapper.writeValue(pathToJsonFile.toFile(), passwordHolder);
        } catch (IOException e) {
            throw new RuntimeException("Failed to serialize json file", e);
        }
    }

    @Override
    public Collection<String> read() {
        try {
            return objectMapper.readValue(pathToJsonFile.toFile(), PasswordHolder.class).getPasswords();
        } catch (IOException e) {
            throw new RuntimeException("Failed to deserialize json file", e);
        }
    }


}
