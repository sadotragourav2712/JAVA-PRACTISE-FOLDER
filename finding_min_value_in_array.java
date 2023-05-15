public class finding_min_value_in_array {
    public static void main(String[] args){
        int [] arr= {88,9,4,2,20,22};
        int len=arr.length;
        int min=Integer.MAX_VALUE;//to get the max value in the java to get the min value write Integer.MAX_VALUE
        for(int e:arr){
            if(e<min){
                min=e;
            }
        }
        System.out.println("the min value in the array is " + min);
    }
}
