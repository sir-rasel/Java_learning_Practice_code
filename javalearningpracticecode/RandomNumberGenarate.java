
package javalearningpracticecode;

import java.util.Random;

public class RandomNumberGenarate {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10);
        System.out.println("Random Number = "+randomNumber);
        
        int randomNumber1 = (int)(Math.random() * 10);
        System.out.println("Random Number = "+randomNumber1);
    }
}
