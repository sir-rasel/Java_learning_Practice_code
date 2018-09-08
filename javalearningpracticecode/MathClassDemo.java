/*  PI,abs(),addExact(), cbrt(), decrementExact(),incrementExact(), subtractExact()
    toString(), multyplyExact(), max(), min();
*/

package javalearningpracticecode;
import java.util.Scanner;

public class MathClassDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two number: ");
        long  a = input.nextLong();
        long  b = input.nextLong();
        
        System.out.println("Pi = "+Math.PI);
        System.out.println("Add Exact = "+Math.addExact(a, b));
        System.out.println("Subtract Exact = "+Math.subtractExact(a, b));
        System.out.println("Multyply Exact = "+Math.multiplyExact(a,b));
        System.out.println("Cube Root = "+Math.cbrt(27));
        System.out.println("Increment Exact = "+Math.incrementExact(a));
        System.out.println("Decrement Exact = "+Math.decrementExact(b));
        System.out.println("Max = "+Math.max(a,b)+" Min = "+Math.min(a, b));
    }
}
