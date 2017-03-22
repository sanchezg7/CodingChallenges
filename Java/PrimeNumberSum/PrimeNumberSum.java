/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbersum;

/**
 *
 * @author GerardoUB
 */


public class PrimeNumberSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int loop = 0;
        int number = 2;
        int sum = 0;
        
        while( loop < 1000)
        {
            //skip this if statement if it is not a prime
            if (primeTest(number))
            {
              //add the current number to the sum
              sum += number;
              //increment the loop iterator
              ++loop;
            }
            //increment the number of interest
            ++number;
        }
        System.out.println(sum);
        System.exit(0);
    }
    public static boolean primeTest(int integer)
    {
        //check to see if number is divisble by i untill it
        //reaches the halfway point where associative rule
        //of multiplication applies
        for (int i = 2; i <=(integer/2); ++i) //stops half way of the number that was input
        {
            if(integer % i == 0)
            {
                return false; //integer is divisible by i
            }
        }
        return true;
             
    }
    }
    

    
    


