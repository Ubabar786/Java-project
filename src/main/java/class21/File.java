package class21;

public abstract class File {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void open();

    public void edit() {
        System.out.println("Edit file " + name);
    }

    public void close() {
        System.out.println("Close file " + name);
    }
}

    class JavaFile extends File {

        public JavaFile(String name, int size) {
            super(name, size);
        }

        @Override
       public void open() {
            System.out.println("Open .java file we need Intellij");
        }
    }

    class WordFile extends File {
        public WordFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("Open .doc file we need microsoft word");
        }
    }

    class PdfFile extends File {

        public PdfFile(String name, int size) {
            super(name, size);
        }

        @Override
        public void open() {
            System.out.println("Open .Pdf file we need adobe");
        }
    }


