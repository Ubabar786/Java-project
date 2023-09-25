package review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AnimalTester {
    public static void main(String[] args) {
      /*  Animal animal=new Animal();
        animal.speak();
        animal.eat();

        Dog d=new Dog();
        d.speak();
        d.eat();*/

        //Polymorphism with array
        Animal[] arr={new Animal(), new Dog(), new Cat()};

        for(Animal a:arr){
            a.speak();
            a.eat();
        }
        /* ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        c.get("https:/www.amazon.com/");
        c.getTitle();

        FirefoxDriver f=new FirefoxDriver();
        f.manage().window().maximize();
        f.get("https://www.amazon.com/");
        f.getTitle();

        EdgeDriver e=new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://www.amazon.com/");
        e.getTitle();*/

        WebDriver[] drivers={new ChromeDriver(), new EdgeDriver()};
        for (int i = 0; i < drivers.length; i++) {
            WebDriver w=drivers[i];
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            w.getTitle();
            w.quit();

        }
    }
}
