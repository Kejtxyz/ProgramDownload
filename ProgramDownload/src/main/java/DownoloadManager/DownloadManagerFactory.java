package DownoloadManager;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class DownloadManagerFactory {
    public static DownloadProgram createDownloadManager(){
        Properties properties = new Properties();

        try (InputStream configInputStream = new FileInputStream(configPropertis)) {
        }
        return new DownloadProgram(Paths.get("C:","Users","RENT","IdeaProjects","ProgramDownload"));
    }
}
// socket - sczytuje streamy, wspiera to system operacyjny
//
// przekierowania mozna robic z http client apache
//test do tego
// jetty helloworld set file - testu integracyjnego
//