//My first Java program
//Importing Java Util,so we can get the input from user
import java.util.*;
// Defining Nomenclature
public class Main {
    public static void main(String[] args) {
//        Scanner Function
       Scanner sc = new Scanner (System.in);
       System.out.println("Hello World! This is my First Java code\n");

       System.out.println("My Name Is Yogesh Jha \n");
//       Taking Input from the user
        System.out.println("Enter your name \n");
        String userName = sc.nextLine();
//        Printing the output which is given by the user
        System.out.println("Your name is " + userName);

    }
}