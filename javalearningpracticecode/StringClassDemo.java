/*  length(), concat(), chatAt(), equals(), indexOf(), toLowerCase(),toUpperCase() */
package javalearningpracticecode;
import java.util.Scanner;

public class StringClassDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter two string: ");
        String a = input.nextLine();
        String b = input.nextLine();
        char c = 'r';
        
        System.out.println("Length of a = "+a.length());
        System.out.println("Concat = "+a.concat(b));
        System.out.println("Char at = "+a.charAt(0));
        System.out.println("Is equal = "+a.equals(b));
        System.out.println("Index of = "+a.indexOf('r'));
        System.out.println("To lower case = "+a.toLowerCase());
        System.out.println("To upper case = "+b.toUpperCase());
    }
}
