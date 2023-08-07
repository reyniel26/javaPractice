import java.util.Scanner;

public class Barbie {
    public static void main (String args[]){
    Scanner scanner = new Scanner(System.in);

    String input = scanner.nextLine();

    /*
     * Split the phrase by space
     * Get the highest length
     * Loop each split base on the highest length
     * append each letter, if it has, else space
     */

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

    System.out.println(output);
    scanner.close();
    }
}
