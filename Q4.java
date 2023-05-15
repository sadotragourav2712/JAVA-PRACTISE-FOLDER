
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n;
        n=s.nextInt();
        int sum=0;


        // for(int i=3; i<n; i=i+3){
        //     System.out.println(i);
        //     sum +=i;
        

        // }
        for(int i=0; i<n; i++){

                if(i%3==0){
                    System.out.println(i);
                    sum+=i;
                }
            }
        
        System.out.println(sum);
    }
}
