
package javalearningpracticecode;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give a number a and be to divide a by b: ");
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        try{
            int res = a/b;
            System.out.println("Result = "+res);
        }
        catch(Exception unknown){
            unknown.printStackTrace();
        }
        finally{
            System.out.println("We goes out");
        }
    }
}
