package class20;

import java.io.FileWriter;
import java.io.IOException;
public class E6CreatingPlan {
    public static void main(String[] args) throws IOException {
        FileWriter f=new FileWriter("Text.txt");
        for (int i = 0; i < 10; i++) {
            f.write("Hey guys, chai pilo ohhh garam ha \n");
        }
        f.close();
    }
}
