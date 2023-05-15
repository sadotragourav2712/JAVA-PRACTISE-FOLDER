
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter the three values:");
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if(a>b && a>c){
            System.out.println(a+" greater than " +b+" and " +c);
        }
        else if(b>a && b>c){
            System.out.println(b+" greater than " +a+" and " +c);
        }
        else{
            System.out.println(c+" greater than " +a+" and " +b);
        }


    }
    
}
