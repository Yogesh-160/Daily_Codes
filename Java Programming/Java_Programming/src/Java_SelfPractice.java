import java.util.Scanner;

public class Java_SelfPractice {
    public static void main(String[] args) {

        System.out.println("Practice code in Java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        Float a = sc.nextFloat();
        System.out.println("Enter number 2 : " );
        Float b = sc.nextFloat();
        float sum = a+b;
        float mul = a*b;
        float div = a/b;
        float sub = a-b;
        System.out.println("Sum of two numbers is = " + sum);
        System.out.println("Subtraction of two numbers is = " + sub);
        System.out.println("Multiplication of two numbers is = " + mul);
        System.out.println("Division of two numbers is = " + div);
        System.out.println("Program Ends");
    }
}
