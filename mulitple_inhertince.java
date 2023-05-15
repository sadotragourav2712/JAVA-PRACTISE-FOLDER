import javax.swing.plaf.multi.MultiButtonUI;

interface exam{
    public void display();
}
class student{
    int roll;
    String name;
    student(String n,int r){
        this.roll=r;
        this.name=n;

    }
    public void display(){
        System.out.println("Name of Student is "+ name+"\nRoll number of student is "+roll);
    }
}
public class mulitple_inhertince  extends student implements exam{
    static int marks;
    //  static float percentage;
    mulitple_inhertince(String n, int r,int marks){
        super(n, r);
    this.name=n;
    this.roll=r;
    int total=marks;


    }

    public void display(){
        super.display();
        System.out.println("Total marks are = "+marks+"\nPercentage of student = "+(marks/500)*100);
    }
    public static void main(String[] args){
        mulitple_inhertince.marks=480;
    
        mulitple_inhertince s1=new mulitple_inhertince("Gourav",21053396,marks);
        s1.display();
        

}
}
