package program;

import javafx.scene.shape.Path;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;

public class DonloadManager {
    public void download(URL fileUrl) throws IOException {
        fileUrl.openConnection(){
            try {
                URLConnection urlConnection = fileUrl.openConnection();
                urlConnection.getInputStream();
                Files.copy(urlConnection.getInputStream(), Path.get);
            }catch (IOException e) {
                String massage =  String.format("Failed to download file %s, can't open connection",fileUrl);
                throw new RuntimeException(massage, e);
            }
        }
    }
}
