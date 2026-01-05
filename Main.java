import java.util.*;


public class Main {
    public static void main(String[] args){
        // Print


        //Print in line using in-built function
        System.out.println("Hello World");

        // Print in new line
        System.out.print("Hello World\n");
        System.out.print("Hello World");
        System.out.println("*\n**");


        int a = 10;
        int b = 15;
        int sum = a + b;
        System.out.print(sum);

        // Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print(name);


        // ENter two Input and do sum

        System.out.print("Enter One Number:");
        int A = sc.nextInt();

        System.out.print("Enter One Number:");
        int B = sc.nextInt();

        int SUM = A + B;
        System.out.print("Sum of the Number = " + sum);
        sc.close();

        // TYPE CONVERSION AND CASTING
        byte NUM = 125;
        int NUM2 = 257;
        byte k = (byte)NUM2;
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);


        // Type Promotion
        byte val = 35;
        byte val2 = 25;

        // We are performing operation on multiply byte into byte and the output is greater the the size of byte so we can store in int datatype
        int Result = val * val2;
        System.out.println(Result);
        */

    }
}
