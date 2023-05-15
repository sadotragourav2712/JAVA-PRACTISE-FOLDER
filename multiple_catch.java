public class multiple_catch {
    public static void main(String[]args){
        int a=10;
        int b=0;
        try{
            int z=a/b;
            int []arr=new int[2];
            System.out.println(arr[3]);
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
