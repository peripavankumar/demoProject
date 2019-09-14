package demoJava;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class AppConfig {
	public static void main(String[] args) {

        try (OutputStream output = new FileOutputStream("C://Users/peri/eclipse-workspace/DemoProject/src/demoJava/configuration.properties")) {

            Properties prop = new Properties();

            // set the properties value
            prop.setProperty("Username", "Peri");
            prop.setProperty("Password", "perkins");

            // save properties to project root folder
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
