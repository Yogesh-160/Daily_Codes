//How do you swap two numbers without using a third variable in Java?
 public class swapNumbers{
    public static void main(String[] args){
        int a = 80;
        int b = 95;

        System.out.println("Before Swapping of Numbers A = " + a + " B = "+ b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping of Two numbers A becomes = " + a + " B becomes = " + b);
    }
}

//a = a+b;
//20+30 = 50
//a = 50
//
//b = a-b
//
//50-30 = 20
//
//b =20
//
//a= a-b
//50 - 20 = 30
//a= 30
//
//a = 30 b = 20

