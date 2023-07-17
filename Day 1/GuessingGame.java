import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!\n\n");

        System.out.println("Are you ready to play?(y/n)");

        String input = scanner.nextLine();

        if (input.equals("y")){
            System.out.println("Welcome to the Void!!\n\n");

            System.out.println("You can't get out until you correctly guess the number");

            byte randomNumber = (byte)(int)(Math.random()*101);
            byte guessNumber = 0;
            int numberOfGuesses = 0;
            String guessNumbers = "";

            do{
                System.out.print("Guess the number from 1 to 100: ");

                guessNumber = scanner.nextByte();

                if (guessNumber < randomNumber){
                    System.out.println("\nYou're number is too small Hahaha\n");
                }
                else if (guessNumber > randomNumber){
                    System.out.println("\nWhat a big number Hahaha\n");
                }

                numberOfGuesses++;
                guessNumbers+=guessNumber+", ";

            }while(guessNumber != randomNumber);

            System.out.println("\nCongratulations, you escape the Void!!");
            System.out.println("Number of Guess is "+numberOfGuesses);

            System.out.print("Numbers:");
            String[] arrOfStr = guessNumbers.split(",");
            for (String a : arrOfStr)
                System.out.print(a+" ");
            System.out.println();
        }
        else{
            System.out.println("Aw Dang! You don't want to play");
        }

        System.out.println("Exiting... Run again if you want");

        scanner.close();
    }
}
