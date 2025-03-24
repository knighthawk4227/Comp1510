package q4;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Exponential {

    // Method to calculate e^x using the Taylor series
    public double calcSum(int x) {
        double calc = 0;
        int numTerms = 50;  // Increased number of terms for better approximation

        // Summing the terms in the Taylor series: e^x = sum(x^n / n!, for n = 0 to infinity)
        for (int n = 0; n < numTerms; n++) {
            double term = Math.pow(x, n) / factorial(n);  // Calculate each term
            calc += term;  // Add each term to the result

            // Break if the term is so small that it won't contribute meaningfully
            if (Math.abs(term) < 1e-10) {
                break;  // Stop summing if the term is very small
            }
        }

        return calc;  // Return the calculated value of e^x
    }

    // Method to calculate factorial of a number
    public double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to print a table of e^x for x from -10 to 10
    public static void main(String[] args) {
        Exponential eq = new Exponential();

        // Print the header of the table
        System.out.println("   x    |   e^x   ");
        System.out.println("---------------------");

        // Loop through x values from -10 to 10 (inclusive)
        for (int x = -10; x <= 10; x++) {
            double result = eq.calcSum(x);  // Calculate e^x
            System.out.printf("%6d | %7.5f%n", x, result);  // Print the value of x and e^x
        }
    }
  }
