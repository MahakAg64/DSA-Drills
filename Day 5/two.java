import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {// input
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {// output
            sum += numbers[i];
        }
        System.out.println(sum);

        sc.close();
    }
}
