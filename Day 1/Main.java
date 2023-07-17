public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    /*
     * Print the following in one line
     */
    System.out.print("Print on the same line as next quote.");
    System.out.print("Print on the same line as previous qoute");

    // Print n\
    System.out.println();

    System.out.println(3);

    String name = "Generic Name";
    int age = 99;

    System.out.println("My name is "+name+" and I am "+age+" years old");

    /*

    int myNum = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";

    */

    int x = 5, y = 6, z = 50;
    System.out.println(x+y+z);

    byte myByte = 100;
    System.out.println(myByte);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    System.out.println("The max number between "+x+" and "+y+" is "+Math.max(x,y));

  }
}