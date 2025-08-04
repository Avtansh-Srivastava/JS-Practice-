/**
 * Problem-Solving and Logic-Based Questions - Practice Session 1
 * 
 * This file contains fundamental problem-solving questions that test logical thinking
 * and basic programming skills without requiring complex data structures.
 * 
 * Instructions:
 * 1. Read each problem carefully
 * 2. Think through the approach before coding
 * 3. Write clean, readable code
 * 4. Test your solution with different inputs
 * 5. Ask questions if you need clarification
 */

public class ProblemSolvingBasics {
    
    /**
     * PROBLEM 1: Palindrome Number Checker
     * 
     * Write a method to check if a given integer is a palindrome.
     * A palindrome number reads the same backward as forward.
     * 
     * Examples:
     * - 121 → true (reads as 121 from both directions)
     * - 123 → false (reverse is 321)
     * - -121 → false (negative numbers are not palindromes)
     * 
     * Constraints:
     * - Do not convert the number to string
     * - Handle negative numbers appropriately
     * - Consider edge cases like single digits
     * 
     * @param num The integer to check
     * @return true if the number is a palindrome, false otherwise
     */
    public static boolean isPalindrome(int num) {
        // TODO: Implement this method
        // Hint: Think about reversing the number mathematically
        // Hint: What should happen with negative numbers?
        
        return false; // Replace this with your implementation
    }
    
    /**
     * PROBLEM 2: Sum of Digits
     * 
     * Write a method to calculate the sum of all digits in a given positive integer.
     * 
     * Examples:
     * - 123 → 6 (1 + 2 + 3)
     * - 456 → 15 (4 + 5 + 6)
     * - 7 → 7 (single digit)
     * 
     * @param num The positive integer
     * @return Sum of all digits
     */
    public static int sumOfDigits(int num) {
        // TODO: Implement this method
        // Hint: Use modulo (%) and division (/) operations
        
        return 0; // Replace this with your implementation
    }
    
    /**
     * PROBLEM 3: Factorial Calculator
     * 
     * Write a method to calculate the factorial of a given non-negative integer.
     * Factorial of n (n!) = n × (n-1) × (n-2) × ... × 1
     * 
     * Examples:
     * - 5! = 5 × 4 × 3 × 2 × 1 = 120
     * - 0! = 1 (by definition)
     * - 1! = 1
     * 
     * @param n The non-negative integer
     * @return Factorial of n
     */
    public static long factorial(int n) {
        // TODO: Implement this method
        // Hint: Consider both iterative and recursive approaches
        // Hint: Handle the base case of 0!
        
        return 0; // Replace this with your implementation
    }
    
    /**
     * Test method to verify your implementations
     * Run this to check if your solutions work correctly
     */
    public static void main(String[] args) {
        System.out.println("=== Problem-Solving Basics - Test Cases ===\n");
        
        // Test Problem 1: Palindrome
        System.out.println("Problem 1: Palindrome Number Checker");
        System.out.println("isPalindrome(121): " + isPalindrome(121) + " (Expected: true)");
        System.out.println("isPalindrome(123): " + isPalindrome(123) + " (Expected: false)");
        System.out.println("isPalindrome(-121): " + isPalindrome(-121) + " (Expected: false)");
        System.out.println("isPalindrome(7): " + isPalindrome(7) + " (Expected: true)");
        System.out.println();
        
        // Test Problem 2: Sum of Digits
        System.out.println("Problem 2: Sum of Digits");
        System.out.println("sumOfDigits(123): " + sumOfDigits(123) + " (Expected: 6)");
        System.out.println("sumOfDigits(456): " + sumOfDigits(456) + " (Expected: 15)");
        System.out.println("sumOfDigits(7): " + sumOfDigits(7) + " (Expected: 7)");
        System.out.println();
        
        // Test Problem 3: Factorial
        System.out.println("Problem 3: Factorial Calculator");
        System.out.println("factorial(5): " + factorial(5) + " (Expected: 120)");
        System.out.println("factorial(0): " + factorial(0) + " (Expected: 1)");
        System.out.println("factorial(1): " + factorial(1) + " (Expected: 1)");
        System.out.println();
        
        System.out.println("=== Ready to start coding? ===");
        System.out.println("1. Choose a problem to work on");
        System.out.println("2. Think through your approach");
        System.out.println("3. Implement your solution");
        System.out.println("4. Test with the provided test cases");
        System.out.println("5. Ask for feedback and move to the next problem!");
    }
}