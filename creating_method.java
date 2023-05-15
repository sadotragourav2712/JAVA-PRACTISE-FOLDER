import java.util.Scanner;

public class creating_method {
     int operation(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;

    }
//when we use call the method by creating the obj then we don't have to write the static in front of the created method but if we are calling the oethod by normal way then we have to write static in front of method
    public static void main(String[] args) {
        System.out.println("Enter the value of and b ");
        try(Scanner sc = new Scanner(System.in)){

        creating_method obj = new creating_method();
        int sum =0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum=obj.operation(a,b);
        System.out.println("The sum of a and b is " + sum);

    }
}

}
