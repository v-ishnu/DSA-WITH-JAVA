package Basic;

import java.util.*;

public class Q1Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a nyumber:");
        int num = sc.nextInt();

        // System.out.println(num % 2 == 0 ? "Even" : "Odd");

        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        } else {
            System.err.println(num + " is Odd Number");
        }

        sc.close();
    }
}
