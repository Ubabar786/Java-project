package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2ConfigReader {
    public static void main(String[] args) throws IOException {
        String url = getProperty("URL");
        String userName = getProperty("userName");
        String passWord = getProperty("passWord");

        //open the browser
        WebDriver driver = new ChromeDriver();
        //maximise the window
        driver.manage().window().maximize();
        //going to navigate the url
        driver.get(url);
        //locate the text field
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //enters the text into the field
        userNameField.sendKeys(userName);

        WebElement passWordField = driver.findElement(By.id("txtPassword"));
        passWordField.sendKeys(passWord);

        WebElement loginBtn = driver.findElement(By.id("BtnLogin"));
        loginBtn.click();

        driver.quit();

       /* String userName1=getProperty("userName1");
        System.out.println(userName1);
        System.out.println(getProperty("passWord1"));
        System.out.println(getProperty("url1")); */

    }

    public static String getProperty(String propKey) throws IOException {
        String path = System.getProperty("user.dir") + "\\Files\\Config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);
        //returns the value of the property that we provide in the parameter
        String value = properties.getProperty(propKey);
        return value;
    }

}
