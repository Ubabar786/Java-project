package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //located the file
        //String path = "C:\\Users\\babar\\IdeaProjects\\untitled1\\Files\\Config.properties";
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //Moves the file from permanent storage into the RAM
        FileInputStream fis=new FileInputStream(path);
        //That one class/software that will assist us to read write data from file
        Properties properties=new Properties();
        //Loads the data from txt file into the properties object
        properties.load(fis);
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("passWord"));
        System.out.println(properties.get("URL"));
        //This line below gives the location of your Intellij project on your computer
        System.out.println(System.getProperty("user.dir"));

    }
}
