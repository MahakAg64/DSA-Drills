
//Largest of three numbers
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        int a,b,c, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        a = sc.nextInt();
        System.out.println("Enter number: ");
        b = sc.nextInt();
        System.out.println("Enter number: ");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("Largest number : " + a);
        }
        else if (b > c) {
            System.out.println("Largest number : "+ b);
        }
        else{
            System.out.println("Largest number : "+c);
        }
    }
}
