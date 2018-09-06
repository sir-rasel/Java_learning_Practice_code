
package javalearningpracticecode;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[]arr = {1,2,3,4,5};
        
        System.out.println("Array Element is : ");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        int [][] twoDimensional = new int[5][5];
        System.out.println("Enter Array Element is : ");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                twoDimensional[i][j] = input.nextInt();
            }
        }
        System.out.println("Teo dimensional Array Element is : ");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(twoDimensional[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
    
}
