import java.util.Scanner;
public class array {
    public static void main(String[] args){
        int [] arr=new int[5];
        arr[0]=10;
        arr[1]=90;
        arr[2]=60;
        arr[3]=40;
        arr[4]=20;

        System.out.println(arr.length);//to get the length of the array
        System.out.println(arr[1] + arr[2]);

        Scanner s = new Scanner(System.in);
        System.out.println("printing the array using loop");
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("printing the array in reverse order using loop");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        System.out.println("Printing the loop using for-each loop");
        for(int element: arr){
            System.out.println(element);
        }




    }
}

