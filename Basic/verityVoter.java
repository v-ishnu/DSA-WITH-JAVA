package Basic;
import java.util.*;

public class verityVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("Wait till you turn to 18 year");
        }

        sc.close();
    }
}
