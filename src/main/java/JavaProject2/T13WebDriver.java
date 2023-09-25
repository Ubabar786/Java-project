package JavaProject2;

interface T13WebDriver {
    /*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them.
*/
    void open();

    void close();

    String getTitle();

    interface RemoteWebDriver extends T13WebDriver {
        void navigate();
    }

    interface TakeScreenShot extends RemoteWebDriver {
        void getScreenShot();
    }

    class ChromeDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {
            return null;

        }

        @Override
        public void navigate() {
        }
    }

    class FirefoxDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {
            return null;

        }

        @Override
        public void navigate() {
        }
    }

    class SafariDriver implements RemoteWebDriver {
        @Override
        public void open() {
        }

        @Override
        public void close() {
        }

        @Override
        public String getTitle() {
            return null;

        }

        @Override
        public void navigate() {
        }
    }

    class Tester {
        public static void main(String[] args) {
            ChromeDriver c = new ChromeDriver();
            c.open();
            c.close();
            c.navigate();
            c.getTitle();

            FirefoxDriver f = new FirefoxDriver();
            f.open();
            f.close();
            f.navigate();
            f.getTitle();

            SafariDriver s = new SafariDriver();
            s.open();
            s.close();
            s.navigate();
            s.getTitle();

        }
    }
}
