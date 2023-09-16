package class20;

import org.openqa.selenium.chrome.ChromeDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();

       /* FirefoxDriver firefox=new FirefoxDriver();
        firefox.manage().window().maximize();
        Thread.sleep(2000);
        firefox.navigate().to("https://google.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://facebook.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://amazon.com");
        System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().back();
        firefox.close();*/
    }
}
