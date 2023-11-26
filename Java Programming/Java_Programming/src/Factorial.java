import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){

        int  i, num;
        int fact = 1;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        num = sc.nextInt();

        for (i = 1; i <= num; i++){
           fact *= i;
        }

        System.out.println("The Factorial of " + num + " = " + fact);
    }
}
