import java.util.Scanner;
import java.io.File;

public class Ngram {
    public static void main(String args[]){

        String path = "n_gram.in";


        try {
            Scanner scanner = new Scanner(new File(path));

            String input = "";
            while(scanner.hasNextLine()){
                input = scanner.nextLine();

                String string = input.split(" ")[0];
                int ngram = Integer.parseInt(input.split(" ")[1]);

                int ngram_size = Math.floorDiv(string.length(), ngram)*ngram;

                System.out.println(ngram_size);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}