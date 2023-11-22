
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int Num1 = sc.nextInt();
        System.out.println("Enter Num2 : ");
        int Num2 = sc.nextInt();
        System.out.println("Enter Operator (+,-,*,/)");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                result = Num1 + Num2;
                System.out.println(" " + Num1 + "+ " + Num2 + " = " + result);
                break;

                case '-':
                result = Num1 - Num2;
                System.out.println(" " + Num1 + " " + Num2 + " = " + result);
                break;

            case '*':
                result = Num1 * Num2;
                System.out.println(" " + Num1 + " " + Num2 + " = " + result);
                break;

            case '/':
                result = Num1 / Num2;
                System.out.println(" " + Num1 +  " " + Num2 + " = " + result);
                break;



        }


    }
}
