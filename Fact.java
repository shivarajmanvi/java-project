import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1.");
        } else {
            long factorial = 1; // Use long to handle larger factorials
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}