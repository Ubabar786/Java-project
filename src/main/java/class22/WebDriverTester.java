package class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {
    public static void main(String[] args) throws InterruptedException {
         WebDriver w=new FirefoxDriver();
       // WebDriver[] browsers = {new ChromeDriver(), new EdgeDriver(), new FirefoxDriver()};
       // for (WebDriver w : browsers) {
            w.manage().window().maximize();
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com/");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }
    }


