class a{
    a(){
        System.out.println("hello from a");
    }
    a(int l){
        System.out.println("Value is "+l);
    }

    
}
class b extends a{
    b(){
        // super();
        super(10);
        System.out.println("hello from b"); 
    }
}
public class super1 {
    public static void main(String[]args){
            b h=new b();
    }
    
}
