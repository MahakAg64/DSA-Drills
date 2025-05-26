import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1");
        n = scanner.nextInt();
        System.out.println("Enter numebr 2");
        m = scanner.nextInt();
        if (n == m) {
            System.out.println("Numbers are equal");
        }
        else if (n > m) {
            System.out.println(n+" is greater");
        }
        else {
            System.out.println(m + " is greater");
        }
        scanner.close();
    }
}