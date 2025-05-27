import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("It's a leap year.");
        } else if (n % 400 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's  not a leap year!");
        }
        sc.close();
    }
}
