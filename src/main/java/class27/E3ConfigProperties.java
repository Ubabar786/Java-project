package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public static void main(String[] args) throws IOException {

        String url=getProperty("URL");
        String userName=getProperty("userName");
        String password=getProperty("password");
        //open the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //going to navigate to the URL
        driver.get(url);
        //locate the text field
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //enter the text into the field
        userNameField.sendKeys(userName);
        //locate the password field
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);

        //locate the login button
        WebElement LoginButton = driver.findElement(By.id("btnLogin"));
        LoginButton.click();

        driver.quit();


    }
    //below code written will go inside the Config.properties
    public static String getProperty(String propKey) throws IOException {
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop= new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value=prop.getProperty(propKey);
        return value;
    }

    public static String getProperty(String path, String propKey) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        Properties prop= new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value=prop.getProperty(propKey);
        return value;
    }
}