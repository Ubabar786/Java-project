package class21;

public class FileTester {
    public static void main(String[] args) {

        File[] arr={new JavaFile("JavaFile.java", 5000), new WordFile("Word.doc", 500), new PdfFile("New.pdf", 1000)};
        for(File a:arr){
            a.open();
            a.edit();
            a.close();
        }
    }
}
