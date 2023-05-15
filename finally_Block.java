public class finally_Block {
    
        public static void main(String[]args){
            int a=10;
            int b=0;
            try{
                // int z=a/b;
                int []arr=new int[2];
                System.out.println(arr[3]);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException");
            }
            
           
            finally{
                System.out.println("===============----------------------End of program---------------------------===============");
                
            }
        }
        
    }
    
    

