import java.util.Scanner;
public class input_from_user {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the values of the two numbers:");

        System.out.println("Enter the 1st number value:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd no value:");
        int b = s.nextInt();
        int sum=a+b;
        int mul=a*b;
        System.out.print("the value of sum is : ");
        System.out.println(sum);
        System.out.print("the value of mul is: ");
        System.out.println(mul);


    }


}