package DownoloadManager;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DownloadProgram downloadProgram = new DownloadProgram(Paths.get( "C:","Users"," RENT","IdeaProjects","ProgramDownload"));
        URL url = new URL(args[0]);
        downloadProgram.download(url);


    }
}
