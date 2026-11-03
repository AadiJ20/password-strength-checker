import java.util.Scanner;

public class PasswordChecker 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Password Strength Checker ===");
        System.out.print("Enter a password to evaluate: ");
        String password = scanner.nextLine();
        
        evaluatePassword(password);
        
        scanner.close();
    }

    public static void evaluatePassword(String password) 
    {
        int score = 0;
        
        // Criteria checks
        boolean hasLength = password.length() >= 8;
        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasLower = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");

        // Calculate score
        if (hasLength) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        // Print feedback breakdown
        System.out.println("\n--- Evaluation Results ---");
        System.out.println("At least 8 characters: " + (hasLength ? "✅" : "❌"));
        System.out.println("Contains uppercase letter: " + (hasUpper ? "✅" : "❌"));
        System.out.println("Contains lowercase letter: " + (hasLower ? "✅" : "❌"));
        System.out.println("Contains a number: " + (hasDigit ? "✅" : "❌"));
        System.out.println("Contains a special character: " + (hasSpecial ? "✅" : "❌"));

        // Determine final rating
        System.out.print("\nOverall Strength: ");
        if (score == 5) {
            System.out.println("Strong 🟢");
        } else if (score >= 3) {
            System.out.println("Moderate 🟡");
        } else {
            System.out.println("Weak 🔴 (Consider adding more criteria)");
        }
    }
}