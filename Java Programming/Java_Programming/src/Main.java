//My first Java program
//Importing Java Util,so we can get the input from user
import java.util.*;
// Defining Nomenclature
public class Main {
    public static void main(String[] args) {
//        Scanner Function
       Scanner sc = new Scanner (System.in);
       System.out.print("Hello World!\n");

       System.out.print("My Name Is Yogesh Jha \n");
//       Taking Input from the user
        System.out.print("Enter your name \n");
        String userName = sc.nextLine();
//        Printing the output which is given by the user
        System.out.print("Your name is " + userName);

    }
}