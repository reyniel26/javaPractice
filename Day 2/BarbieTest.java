import java.io.BufferedReader;
import java.io.FileReader;

public class BarbieTest {
    public static void main (String args[]){
        try {
            String path = "barbie.in";
            BufferedReader lineReader = new BufferedReader(new FileReader(path));

            String input = lineReader.readLine();

            while (input != null){
                /*
                * Split the phrase by space
                * Get the highest length
                * Loop each split base on the highest length
                * append each letter, if it has, else space
                */
                System.out.println("\n"+input+"\n");

                String[] words = input.split(" ");

                int max = 0;
                for (String word : words) {
                    max = (max < word.length()) ? word.length() : max;
                }

                String output = "";
                for (int i = 0; i < max; i++) {
                    for (String word : words) {
                        output += (i < word.length()) ?  String.valueOf(word.charAt(i)) : " ";
                    }
                    output+="\n";
                }

                System.out.println(output.trim());

                input = lineReader.readLine();
            }

            lineReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
