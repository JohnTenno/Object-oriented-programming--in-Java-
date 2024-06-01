import java.util.Scanner;

class PasswordWeak extends Exception {
    public PasswordWeak(String message) {
        super(message);
    }
}

class ValidPassword {
    public void valirdPassword(String password) throws PasswordWeak {
        if (password == null || password.length() < 8) {
            throw new PasswordWeak("Password must be have 8 caracters.");
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        if (!hasLowerCase || !hasUpperCase || !hasNumber) {
            throw new PasswordWeak(
                    "The password must contain at least one uppercase letter, one lowercase letter and one numerical digit.");
        }
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidPassword validador = new ValidPassword();

        try {
            System.out.print("Input Password: ");
            String password = scanner.nextLine();
            validador.valirdPassword(password);
            System.out.println("Password valid.");
        } catch (PasswordWeak e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: no password is entered.");
        } catch (Exception e) {
            System.out.println("Error unexpeted: " + e.getMessage());
        } finally {
            System.out.println("finish.");
            scanner.close();
        }
    }
}