package q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Mitchell Schaeffer
 * @version 1.0
 */
public class Primes {
    /** <p> Prime list of prime nums bool.</p>*/
    public List<Boolean> primes;
  
    /** Number passed to constructor */
    private final int n;
    
    /** <p> Prime calculator.</p>
     * @param n number to check up to*/
    public Primes(int n) {
      this.n = n;
        primes = new ArrayList<Boolean>(n + 1);
        for (int i = 0; i <= n; i++) {
          primes.add(true);
        }
        calculatePrimes(n);
        
    }
    
    
    public void calculatePrimes(int num) {
        primes.set(0,false);
        primes.set(1,false);
        //The reason we do math.sqrt is cause we will have already checked all the multiples
        for (int i = 2; i <= Math.sqrt(num); i++) { 
          if  (primes.get(i)) {
            for (int j = i * 2; j <= num; j+= i) {
                primes.set(j, false);
            }
          }
        }
    }

    public void printPrimes() {

      for (int i = 0; i < primes.size(); i++) {
        if (primes.get(i) == true) {
          System.out.print(i + " ");
        }
      }
      System.out.println();
      }

    public int countPrimes() {
      int count = 0;
      for (int i = 0; i < primes.size(); i++) {
        if (primes.get(i) == true) {
          count++;
        }
      }
      return count;
    }
    

    public boolean isPrime(int num) {
      if (num > n || num < 1) {
        System.out.println("that is not in our range");
        return false;
      } else {
        if (primes.get(num)) {
          return true;
        } else {
          return false;
        }
      }
    }

    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n;
        System.out.println("This program uses the sieve of "
                + "Eratosthenes to determine\r\n" + //
            "which numbers are prime.\r\n");
        do {
          System.out.print("Enter an upper bound: ");
            while (!scan.hasNextInt()) {
              System.out.println("that is not a numer");
              scan.nextLine();
          }
        n = scan.nextInt(); 
      } while (n <= 1);
      
      Primes prime = new Primes(n);
      scan.close();

      
      System.out.println("\nThere are " + prime.countPrimes() + " primes.");
      System.out.println("The primes between 0 and " + n + " are: ");
       prime.printPrimes();
      // System.out.println(prime.isPrime(4));

        
        System.out.println("\n\nQuestion three was called and ran sucessfully.");
    }

  }