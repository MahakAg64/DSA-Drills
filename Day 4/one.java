//To count digits in a number
import java.util.Scanner;

public class one{
    public static void main(String[] args) {
        int n, i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}