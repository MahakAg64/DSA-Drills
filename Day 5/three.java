
//Largest of three numbers
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i]=sc.nextInt();
        }
        int max = numbers[0];
        for (int i = 0; i < size; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        sc.close();
        }
}
