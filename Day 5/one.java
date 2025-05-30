//Printing Array
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {// input
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {// output
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
