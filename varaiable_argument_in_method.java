public class varaiable_argument_in_method {
    static int sum(int ...arr)
    {
        //arr here avaivalbe as int [] arr
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("the sum of nothing is " + sum());
        System.out.println("the sum of 1,2 is " + sum(1,2));
        System.out.println("the sum of 1,2,3 is " + sum(1,2,3));
        System.out.println("the sum of 1,2,3,4 is " + sum(1,2,3,4));
    }
}
