import java.util.Scanner;
public class CBSE_Exercise {
    public static void main(String[] args) {
        System.out.println("Java Program to calculate percentage of 5 Subjects");
        Scanner sc = new Scanner(System.in);
//        We can give Scanner name sc or anything.
        System.out.println("Max marks of Hindi = ");
        int Hin = sc.nextInt();
        System.out.println("Max marks of English = ");
        int En = sc.nextInt();
        System.out.println("Max marks of Maths = ");
        int Ma = sc.nextInt();
        System.out.println("Max marks of Social Science = ");
        int SS = sc.nextInt();
        System.out.println("Max marks of Science = ");
        int Sci = sc.nextInt();
        int Total_Marks = Hin+En+Ma+SS+Sci;

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


        float Result = ((Hindi+English+Maths+Social+science)*100)/Total_Marks;
        System.out.println("The Percentage you achieved is = " + Result);


    }
}
