import java.util.Scanner;

public class creating_2d_array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            int[][] arr = new int[10][10];
            System.out.println("Enter the number of rows: ");
            n=sc.nextInt();
            System.out.println("Enter the values: ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j]=sc.nextInt();

                }
            }
            System.out.println("Displaying the array: ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
