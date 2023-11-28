//Write a Java Program to print sum and average of 5 numbers
import java.sql.SQLOutput;
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1, num2, num3,num4,num5, TotalSum;
        float Average;
        System.out.println("Enter Number 1 : ");
        num1 = sc.nextFloat();

        System.out.println("Enter Number 2 : ");
        num2 = sc.nextFloat();

        System.out.println("Enter Number 3 : ");
        num3 = sc.nextFloat();

        System.out.println("Enter Number 4 : ");
        num4 = sc.nextFloat();

        System.out.println("Enter Number 5 : ");
        num5 = sc.nextFloat();

        TotalSum= num1+num2+num3+num4+num5;
        Average = (num1+num2+num3+num4+num5)/5;

        System.out.println("The sum of 5 Numbers is = " + TotalSum);
        System.out.println("The average of 5 Numbers is = "+ Average);
    }

}

//2.2

//4+3+2+1+1 / 5 = 2.2
