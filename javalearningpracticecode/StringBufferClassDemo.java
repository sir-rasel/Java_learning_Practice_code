/*  length(), append(), chatAt(), equals(), capacity(), reverse(), delete(), 
    insert(), replace(), deleteCharAt() */

package javalearningpracticecode;
import java.util.Scanner;

public class StringBufferClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter two string: ");
        StringBuffer a = new StringBuffer("Saiful ");
        StringBuffer b = new StringBuffer("Islam ");
        StringBuffer c = new StringBuffer("Rasel");
        StringBuffer d = new StringBuffer(c);
        
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
