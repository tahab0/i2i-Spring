package sprproj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.*;
import java.net.URI;
@SpringBootApplication
public class springp {
    public static void main(String[] args){
        SpringApplication.run(springp.class, args);
        openLocalPage();
    }
    private static void openLocalPage(){
        String URL = "http://localhost:8080/subscriber";
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(URL));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Web sayfasını otomatik olarak açma desteği bulunmuyor.");
        }
    }
}

