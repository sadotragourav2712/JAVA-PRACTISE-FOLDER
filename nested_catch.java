import java.lang.reflect.Array;

public class nested_catch {
    public static void main(String[]args){
        int a=10;
        int b=0;
        try{
            int z=a/5;
            try{
                 z=b/0;
                int []arr=new int[2];  
            System.out.println(arr[3]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array value wrong");
        }
        catch(Exception e){
            System.out.println("Exception caught");

        }
    }
    
}

