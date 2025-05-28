
//Check prime number
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int n, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        if (n == 1) {
            System.out.println("Number is not prime!");
        }
        else {
            for (i = 2; i <= n / 2; i++) 
            {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count > 0){
                System.out.println("Number is not prime!");
            }
            else{
                System.out.println("Number is prime!");
            }

        }
            sc.close();
    }
}
