import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

// int Result = num1+num2;

        System.out.println("Enter num1 :" );
        int num1 = sc.nextInt();

        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        int Result = num1 + num2;

        System.out.println("The Sum of two numbers is = " + Result);


    }
}
