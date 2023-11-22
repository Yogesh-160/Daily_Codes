import java.util.Scanner;

public class Calc1{
    public static void main(String[] args){
        char operator;
        float num1, num2, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        num1 = sc.nextFloat();

        System.out.println("Enter Number2 : ");
        num2 = sc.nextFloat();

        System.out.println("Enter Operator (+,-,*,/)");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                result = num1+num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1-num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1*num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1/num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid! Try again...");

        }
        
    }
}
