import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        return (!(ch >= 'A' && ch <= 'Z')) ? ch : (char) (ch + 32);
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        StringBuilder output = new StringBuilder();
        for (char ch : str.toCharArray()) {
            output.append(toLower(ch));
        }
        return output.toString();
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        return (!(ch >= 'a' && ch <= 'z')) ? ch : (char) (ch - 32);
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        StringBuilder output = new StringBuilder();
        for (char ch : str.toCharArray()) {
            output.append(toUpper(ch));
        }
        return output.toString();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String string = scan.nextLine();
        System.out.println("Would you like to make your string lowercase or uppercase?");
        switch(scan.next().toUpperCase()) {
            case "LOWERCASE":
                System.out.println(myToLowerCase(string));
                break;
            case "UPPERCASE":
                System.out.println(myToUpperCase(string));
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        scan.close();
    }
}
