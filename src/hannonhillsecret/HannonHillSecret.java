/*
 * @author Eric Blanks
 * This application determines if Secret is an additive function 
 * secret(x+y) = secret(x) + secret(y) for all combinations of prime numbers 
 * less than N where N is also a given
 *
 * The reason why Java was choosen is because of its documentation and libraries
 * that are avaiable. It also can run on any platform.
 */
package hannonhillsecret;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eblanks
 */
public class HannonHillSecret {

    /**
     * @param args requires one argument which must be a positive number
     */
    public static void main(String[] args) {
        
        try {
            int limit = Integer.parseInt(args[0]);
            List<Integer> primeNumbers = getAllPrimes(limit);

            if (checkSecret(primeNumbers)) {
                System.out.println("secret is additive.");
            } else {
                System.out.println("secret is not additive.");
            }
        } catch (Exception e) {
            System.out.println("This application requires one argument(integer) to run");
        }
    }
    
    /**
     * @param number
     * @return 
     */
    private static int secret(int number) {
        return number;
    }
    
    private static List<Integer> getAllPrimes(int limit) {
        // initially assume all integers are prime
        boolean[] isPrime = new boolean[limit + 1];
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= N using Sieve of Eratosthenes
        for (int i = 2; i*i <= limit; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., limit/i
            if (isPrime[i]) {
                for (int j = i; i*j <= limit; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // add prime numbers to an arary
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) { 
                primeNumbers.add(i);
            }
        }
        
        return primeNumbers;
    }
    
    private static boolean checkSecret(List<Integer> primeNumbers) {
        
        List<Integer> used = new ArrayList<>();
        int xPlusY;
        int additiveOne;
        int secretOfX;
        int secretOfY;
        int additiveTwo;
        int x;
        
        for(x = 0; x < primeNumbers.size(); x++) {
            for(int y = 0; y < primeNumbers.size(); y++) {
                if(!used.contains(y) ) {
                    xPlusY = primeNumbers.get(x) + primeNumbers.get(y);
                    additiveOne = secret(xPlusY);
                    secretOfX = secret(primeNumbers.get(x));
                    secretOfY = secret(primeNumbers.get(y));
                    additiveTwo = secretOfX + secretOfY;
                    if(additiveOne != additiveTwo) {
                        return false;
                    }
                }
            }
            used.add(primeNumbers.get(x));
        }
        return true;
    }  
}
