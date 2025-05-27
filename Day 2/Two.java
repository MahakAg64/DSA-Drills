import java.util.Scanner;

    public class Two {
    public static void main(String[] args) {
         int n;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number : ");
         n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "even" : "odd");
        sc.close();
    }
}
