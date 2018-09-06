
package javalearningpracticecode;
import java.util.Scanner;

public class MethodIntroducing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input two number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println("Sum of a and b: ");
        int sum = add(a,b);
        System.out.println(sum);
    }
    
    static int add(int a,int b){
        return a+b;
    }
}
