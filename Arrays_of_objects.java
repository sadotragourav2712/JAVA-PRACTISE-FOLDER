import java.util.*;
import java.lang.*;
import java.io.*;

class employee {

    String name;
    int id;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.println("Enter the name of the employee:");
        name = sc.nextLine();
        System.out.println("Enter the Id of the employee");
        id = sc.nextInt();
    }

    void display() {
        System.out.println("Emp ID : " + id);
        System.out.println("Employee name: " + name);
    }
}

public class Arrays_of_objects {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of employee:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        employee e[] = new employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new employee();
        }
        System.out.println("Enter the details of the Employees:");
        for (int i = 0; i < n; i++) {
            e[i].read();

        }
        System.out.println("Displaying the details ofthe Employess:");
        for (int i = 0; i < n; i++) {
            e[i].display();
        }
    }
}
