import java.util.Scanner;
public class method_or_function {
        static int method(int a, int b){
            int c = 0;
            if (a > b) {
                c=a+b;
            }
            else{
                c=a*b;
            }
            return c;
        }
    public static void main(String[] args){
            int a ,b;
        System.out.println("Enter the value of a and b:");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        // if we do by this method than we don't have to write the static in method name
//        method_or_function obj=new method_or_function();
//        int c=obj.method(a,b);

       int c = method(a,b);// we have to write static here
        System.out.println("the value of c = " + c);
    }
}
