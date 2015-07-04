import java.util.*;
import java.io.*;

public class PropertiesSimple {

    public static void main (String[] args) throws Exception {

        FileReader reader=new FileReader("example.properties");

        Properties p = new Properties();
        p.load(reader);


        System.out.println("Reading the example.properties file :");
        System.out.println("user = " + p.getProperty("user"));
        System.out.println("password = " + p.getProperty("password"));
    }
}
