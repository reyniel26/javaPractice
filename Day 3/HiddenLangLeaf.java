import java.io.File;
import java.util.Scanner;

public class HiddenLangLeaf {
    public static void main (String args[]){
        /*
         * Read lines
         * Convert lines
         *     The first letter go to the end
         *      of the word then add "itey"
         * Output lines
         */
        String path = "hiddenleaf.in";

        try {
            Scanner scanner = new Scanner(new File(path));

            String input = "";

            while (scanner.hasNextLine()){

                input = scanner.nextLine();

                String output = "";

                String[] strings = input.split(" ");

                for (String string : strings) {
                    string = string.replace(".", "");
                    output += ((string.length() > 1) ? string.substring(1)+String.valueOf(string.charAt(0)) : string )+"itey ";
                }

                output = String.valueOf(output.charAt(0)).toUpperCase()+output.substring(1).toLowerCase();
                System.out.println(output.trim()+".");
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
