import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        int n, rev=0,i;
        System.out.println("Enter number : ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            i = n % 10;
            rev = rev * 10 + i;
            n = n / 10;
        }
        System.out.println("Reversed number is : " + rev);
        sc.close();
    }
}
