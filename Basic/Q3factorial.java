package Basic;
import java.util.*;

public class Q3factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int num = sc.nextInt();
        long Result = 1;
        for (int i = 1; i <= num; i++){
            Result *= i;
        }
        System.out.println("Factorial of"+ num+ "is :" + Result);

        sc.close();
    }
}
