import java.util.Scanner;

class Functions {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean testArmstrong(int n) {
        int originalNumber = n;
        int result = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result = result + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }
        return result == n;
    }

    public static boolean testPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean testPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Invalid input, please enter a positive integer.");
            return;
        } else if (n == 1) {
            System.out.print("Fibonacci Series: 0");
            return;
        }
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class NumberOperations {
    public static void main(String[] args) {
        Functions f = new Functions();
        Scanner scan = new Scanner(System.in);
        int choice, n;
        do {
            System.out.println("Menu:");
            System.out.println("1. Factorial");
            System.out.println("2. Test Armstrong");
            System.out.println("3. Test Palindrome");
            System.out.println("4. Test Prime");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scan.nextInt();
            if (choice == 6) break;
            System.out.print("Enter the Number: ");
            n = scan.nextInt();

            switch (choice) {
                case 1:
                    int fact = f.factorial(n);
                    System.out.println("Factorial of " + n + " is " + fact);
                    break;
                case 2:
                    boolean armstrong = f.testArmstrong(n);
                    if (armstrong)
                        System.out.println("The Number " + n + " is Armstrong");
                    else
                        System.out.println("The Number " + n + " is not Armstrong");
                    break;
                case 3:
                    boolean palindrome = f.testPalindrome(n);
                    if (palindrome)
                        System.out.println("The Number " + n + " is Palindrome");
                    else
                        System.out.println("The Number " + n + " is not Palindrome");
                    break;
                case 4:
                    boolean prime = f.testPrime(n);
                    if (prime)
                        System.out.println("The Number " + n + " is Prime");
                    else
                        System.out.println("The Number " + n + " is not Prime");
                    break;
                case 5:
                    f.fibonacciSeries(n);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } while (choice != 6);
    }
}


// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 1
// Enter the Number: 6
// Factorial of 6 is 720
// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 2
// Enter the Number: 454
// The Number 454 is not Armstrong
// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 3
// Enter the Number: 747
// The Number 747 is Palindrome
// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 4
// Enter the Number: 7
// The Number 7 is Prime
// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 5
// Enter the Number: 7
// Fibonacci Series: 0, 1, 1, 2, 3, 5, 8
// Menu:
// 1. Factorial
// 2. Test Armstrong
// 3. Test Palindrome
// 4. Test Prime
// 5. Fibonacci Series
// 6. Exit
// Enter your choice: 6