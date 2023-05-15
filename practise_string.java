import java.sql.SQLOutput;

public class practise_string {
    public static void main(String[] args){
        String text="To my Friend";
        System.out.println(text.replace(" ","_"));

        String mystring="This string contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));//returns the index at which two spaces are present if not present returns -1
        System.out.println(mystring.indexOf("   "));

        

    }
}
