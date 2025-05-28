import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
    
}
