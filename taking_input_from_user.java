import java.util.Scanner;
public class taking_input_from_user {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the values of a and b : ");
        a=sc.nextInt();
        b=sc.nextInt();
        int sum = 0;
        sum=a+b;
        System.out.println("The value of a is " + a +" and value of b is " +b);
        System.out.println("The sum of a and b is " +sum);
     }
}
