
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marsk in 5 subjects: ");
        int[] a = new int[10];
        for (int i = 0; i < 5; i++) {
            a[i] = s.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        System.out.println("highest marks are " + max);
        float avg = 0;
        avg = (float) (sum / 5);
        System.out.println("The avg marks are " + avg);

    }
}
