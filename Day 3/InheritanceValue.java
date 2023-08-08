import java.util.Scanner;
import java.io.File;

public class InheritanceValue {
    public static void main (String args[]){
        String path = "e.in";
        try {
            Scanner scanner = new Scanner(new File(path));

            double total = 0;
            String input = "";

            while (scanner.hasNextLine()){

                input = scanner.nextLine();

                String[] strings = input.split(" ");
                for (String string : strings) {
                    total += number(string);
                }

            }
            System.out.printf("$ %,.2f", total);

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    public static double number (String string){
        String number = "";
        for (char c: string.toCharArray()){
            if (Character.isDigit(c)){
                number += String.valueOf(c);
            }
        }

        return (!number.equals("")) ? Double.parseDouble(number) : 0;
    }


}
