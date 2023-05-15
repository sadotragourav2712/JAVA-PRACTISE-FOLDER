import java.util.Scanner;
public class practise_question {
    public static void main(String[] args){
        //to calucalte the percentage of student
        Scanner s=new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name=s.next();

        System.out.println("Enter " + name + " marks:");

        System.out.println("Enter the marks in subject 1:");
        float a = s.nextFloat();
        System.out.println("Enter the marks in subject 2:");
        float b = s.nextFloat();
        System.out.println("Enter the marks in subject 3:");
        float c = s.nextFloat();
        System.out.println("Enter the marks in subject 4:");
        float d = s.nextFloat();
        System.out.println("Enter the marks in subject 5:");
        float e = s.nextFloat();
        float total=a+b+c+d+e;
        System.out.print("Sum of all number(out of 500): ");
        System.out.println(total);
        float per=(total/500)*100;
        System.out.print("Percetange of Student: ");
        System.out.print(per);
    }
}
