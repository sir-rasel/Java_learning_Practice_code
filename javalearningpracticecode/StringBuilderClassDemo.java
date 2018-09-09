/*  length(), append(), chatAt(), equals(), capacity(), reverse(), delete(), 
    insert(), replace(), deleteCharAt() */

package javalearningpracticecode;
import java.util.Scanner;

public class StringBuilderClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter two string: ");
        StringBuilder a = new StringBuilder("Saiful ");
        StringBuilder b = new StringBuilder("Islam ");
        StringBuilder c = new StringBuilder("Rasel");
        StringBuilder d = new StringBuilder(c);
        
        System.out.println("Length of a = "+a.length());
        System.out.println("Capacity = "+a.capacity());
        System.out.println("Append = "+a.append(b));
        System.out.println("Char at = "+a.charAt(0));
        System.out.println("Is equal = "+a.equals(b));
        d.reverse();
        System.out.println("Reverse = "+d);
        d.deleteCharAt(4);
        System.out.println("Reverse = "+d);
        b.insert(0," Md. ");
        System.out.println("String b = "+b);
    }
}
