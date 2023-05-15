interface temp{
    public double c_to_fah(double degree);
}
public class interface_ implements temp{
    public double c_to_fah(double degree){
        return (degree*9/5+32);
    }
    public static void main(String[] args){
        
        interface_ i=new interface_();
        double degree=i.c_to_fah(45);
        System.out.println("degree in fah = " +degree);
    }
    
}
