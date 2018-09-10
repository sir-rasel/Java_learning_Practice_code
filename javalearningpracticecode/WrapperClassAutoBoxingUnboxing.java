/*  toString(), valueOf(), parsexxx(), xxxValueOf() */

package javalearningpracticecode;

public class WrapperClassAutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer I = new Integer(100);
        System.out.println("Integer I = "+I);
        
        Integer J = 100;
        System.out.println("Auto boxng J = "+J);
        
        int i = Integer.valueOf(I);
        System.out.println("Integer i = "+i);
        
        int j = J;
        System.out.println("Unboxing j = "+j);
        
        System.out.println("to string "+I.toString());
        System.out.println("Parsing = "+Integer.parseInt("150"));
        System.out.println("Double value = "+J.doubleValue());
    }
}
