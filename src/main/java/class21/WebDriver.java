package class21;

public abstract class WebDriver {
    abstract void openBrowser();
    abstract void loadUrl(String url);
    abstract void performTest();
    abstract void close();
}
class ChromeDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the Google Browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading the URL "+url);
    }

    @Override
    void performTest() {
        System.out.println("Performing Testing");
    }

    @Override
    void close() {
        System.out.println("Close the Chrome browser.");
    }
}
class FireFox extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening the FireFox Browser");
    }

    @Override
    void loadUrl(String url) {
        System.out.println("Loading the url in FireFox"+url);
    }

    @Override
    void performTest() {
        System.out.println("Performing testing on FireFox");

    }

    @Override
    void close() {
        System.out.println("Closing the FireFox browser.");

    }
}
