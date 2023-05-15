public class method_IN_array {
    static void change(int a){
        a = 45;
    }
    static void change2(int [] arr){
        arr[0]=45;
    }
    public static void main(String[] args){
        //changing using the integer
        //here on passing the value of 'b' to method it doesn't change the value in main
    int b=99;
    change(b);
    System.out.println("The value of b after passing through method : " +b);
    //changing the values in array;
        //here value will be changed
         int [] arr ={11,55,12,69,20};
         change2(arr);
         System.out.println("the value of array[0] after passing through method: "+ arr[0]);

    }
}
