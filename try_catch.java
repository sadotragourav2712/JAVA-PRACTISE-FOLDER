import java.io.*;
import java.util.*;
public class try_catch {
    public static void main(String[] args){
        int a=50;
        int b=0;
        try{
        int z=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
            System.out.println(e.getMessage());
            // System.out.println(e.printStackTrace());
            System.out.println(e.toString());
            System.out.println(e);
        }

    }
    
}
