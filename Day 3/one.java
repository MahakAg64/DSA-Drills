//Factorial of a number
import java.util.Scanner;
class one {
    public static void main(String[] args) {
        int n,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is : "+fact);
        sc.close();
    }

}