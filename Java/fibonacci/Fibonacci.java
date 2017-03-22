/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.*;
import java.util.*;
/**
 *
 * @author GerardoUB
 */
public class Fibonacci { //class name should be "Main" when submitting to codeeval
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File file = new File("inputFib.txt"); //codeEval --> "args[0]"
        Scanner in = new Scanner(file);
        
        while(in.hasNextLine()) {
            int strToInt = in.nextInt();
            int actFib = fib(strToInt);
            
            System.out.println(actFib);
        }
    System.exit(0);
    }
    private static int fib(int n) {
        if ( n == 1 || n == 0) {
            return n;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    
}
