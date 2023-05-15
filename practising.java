import java.util.Scanner;
public class practising {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the value a");
//        int  a = s.nextInt();
//        System.out.println("Enter the value of b :");
//        int b = s.nextInt();
//        System.out.println("The value of a is " + a);
//        System.out.println("The value of b is " + b);
//        int total=0;
//        total=a+b;
//        System.out.println(a+b);
//        System.out.println(total);
//        String name="Gourav";
        System.out.println("Enter the name: ");
        String name =s.nextLine();
        System.out.println("The name of the person is " + name);

        System.out.println(s.hasNextLine());
    }
}
