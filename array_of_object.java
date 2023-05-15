import java.util.*;
class hello{
    int a;
    String n;
    void hel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of student:");
         n=sc.nextLine();
        System.out.println("Enter the age of the student:\n");
         a=sc.nextInt();
    }
    void display(){
        System.out.println("Name of student is "+n);
        System.out.println("Age of student is "+a);
    }
}

public class array_of_object{
    public static void main(String[]args){
        int n;
        System.out.println("Enter the number of student");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        // hello h[n]=new hello();
        hello h[]=new hello[n];
        for(int i=0; i<n; i++){
            // h[i]=new hello[];
            h[i]=new hello();
        }
        for(int i=0; i<n; i++){
            h[i].hel();
        }
        for(int i=0; i<n;i++){
            h[i].display();

        }
        // h.hel();
    }
}