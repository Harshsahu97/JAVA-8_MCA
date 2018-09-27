import java.io.File;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) throws Exception {
        File file = new File("57900.txt");
        Scanner sc = new Scanner(file);
        int word = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            word += (line.split(" ")).length;

        }
        System.out.println(word);
    }

}