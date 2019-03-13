package DownoloadManager;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

// aplikacja do sicagania do pliku storne url
// jetty to tworzenia serverow
public class DownloadProgram {
    public DownloadProgram(Path downoloadDirectory) {
        this.downoloadDirectory = downoloadDirectory;
    }

    private Path downoloadDirectory =

    public void download(URL  fileUrl){
        try {

            URLConnection connection = fileUrl.openConnection();
            Files.copy(connection.getInputStream(), downoloadDirectory.resolve(fileUrl.getFile()));
        }catch (IOException e){
            String massage = String.format("Failed to downoload file %s. Can't ", fileUrl);
            throw  new RuntimeException(massage, e);
        }
    }


}
