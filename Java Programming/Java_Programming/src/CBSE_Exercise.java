import java.util.Scanner;
public class CBSE_Exercise {
    public static void main(String[] args) {
        System.out.println("Java Program to calculate percentage of 5 Subjects");
        Scanner sc = new Scanner(System.in);
//        We can give Scanner name sc or anything.
        System.out.println("Enter Marks of Hindi : ");
         float Hindi = sc.nextFloat();
        System.out.println("Enter Marks of English : ");
        float English = sc.nextFloat();
        System.out.println("Enter Marks of Maths : ");
        float Maths = sc.nextFloat();
        System.out.println("Enter Marks of Social Science");
        float Social = sc.nextFloat();
        System.out.println("Enter Marks of science");
        float science = sc.nextFloat();
        float Result = ((Hindi+English+Maths+Social+science)*100)/600;
        System.out.println("The Percentage you achieved is = " + Result);


    }
}
