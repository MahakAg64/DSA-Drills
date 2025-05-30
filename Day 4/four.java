
//Leetcode136 (Single Number problem)
import java.util.Scanner;
public class four{
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i]=sc.nextInt();
            }
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (numbers[i] == numbers[j]) {
                        count = count + 1;
                    }
                }
                if (count == 0) {
                    System.out.println("number is " + numbers[i]);
                    break;
            }
        }
        sc.close();
    }
}