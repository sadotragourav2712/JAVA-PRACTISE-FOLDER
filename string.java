:import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = s.nextLine();
            System.out.println("Entered name is " + name);
            int len = name.length();//to get the length of the string;
            System.out.println("The length of your name is " + len);
            String lstring = name.toLowerCase();//to conver the string to lower case;
            System.out.println("Name is lower case : " + lstring);

            String ustring = name.toUpperCase();//to conver the string to upper case;
            System.out.println("Name is Upper case: " + ustring);

            String substring = name.substring(2);// to get the string after particular index;
            System.out.println("your name after given index number : " + substring);

            String substring_again = name.substring(2, 5);
            System.out
                    .println("Your name after in between two index (incl starting,excluding end) :" + substring_again);

            String trimmed = name.trim();// it removes all the white spaces
            System.out.println("Your trimmed name is " + trimmed);

            String replaced = name.replace('a', 'l');
            System.out.println("Your name after replacing some character's are: " + replaced);

            String replaced_again = name.replace("ou", "qq");
            System.out.println("Your name after replacing more than 1 character's : " + replaced_again);

            System.out.println(name.startsWith("go"));// returns true if it start with your given input

            System.out.println(name.endsWith("av"));// returns true if it end with your given characters:

            System.out.println(name.charAt(2));// returns character at a given index

            System.out.println(name.indexOf('r'));// gives the location of the given character

            System.out.println(name.indexOf('a', 2));// retunrs the index of the given string from the index
            System.out.println(name.indexOf('o', 2));// it returns -1 as after 2 index there is no o in the name Gourav
            System.out.println(name.lastIndexOf("a"));// returns the last index of the given it starts counting from
                                                      // backwards

            System.out.println(name.lastIndexOf('r', 2));// returns the last index of the given string before 2
            System.out.println(name.equals("Gourav"));// returns true if the given string is equal to the "Gourav" [it
                                                      // is
                                                      // case-sensitive]

            System.out.println(name.equalsIgnoreCase("GOUrav"));// retusn true if the strings are equals ignoring the
                                                                // case
                                                                // of the characters.
        }

    }

}
