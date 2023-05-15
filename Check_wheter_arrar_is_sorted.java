public class Check_wheter_arrar_is_sorted {
    public static void main(String[] args){
        int [] arr={1,55,2,6,8,44,31};
        boolean issorted=true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("The array is sorted:");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }

}
