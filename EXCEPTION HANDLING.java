import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num = input.nextInt();

            System.out.print("Enter denominator: ");
            int den = input.nextInt();

            int ans = num / den;
            System.out.println("Result: " + ans);

        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception ex) {
            System.out.println("Error: Invalid input!");
        } finally {
            System.out.println("Program execution completed.");
            input.close();
        }
    }
}
