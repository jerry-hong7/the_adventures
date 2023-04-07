import java.util.*;
public class Readers extends Resource {
    public static String usernameInput;
    public static String passwordInput;

    public Readers () {}

    public static void register() {
        System.out.println("Welcome to Jerry and Akshay's Library System!\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please create a username: ");
        String userInputUsername = scan.next();
        usernameInput = userInputUsername;

        System.out.println("Now create a password. It must consist of at least 8 characters, \n" +
                "1 uppercase letter, 1 lowercase letter, and 1 digit.\n");
        System.out.print("Enter your desired password here: ");
        String userInputPassword = scan.next();
        passwordInput = userInputPassword;
        checkUsername(userInputUsername);
        checkPassword(userInputPassword);
    }

    public static void checkUsername(String usernameInput) {
        if (reader.contains(usernameInput)) {
            System.out.println("This username already exists. Create a new one.");
        }
        else {
            System.out.println("Your username has been added to the database!");
            reader.add(usernameInput);
        }
    }

    public static void checkPassword(String password) {
        boolean uppercase = false;
        boolean lowercase = false;
        boolean length = false;
        boolean hasNum = false;

        if (password.length() >= 8) {
            length = true;
        }
        for (int a = 0; a < password.length(); a++) {
            if (Character.isUpperCase(password.charAt(a))) {
                uppercase = true;
            }
        }
        for (int b = 0; b < password.length(); b++) {
            if (Character.isLowerCase(password.charAt(b))) {
                lowercase = true;
            }
        }
        for (int c = 0; c < password.length(); c++) {
            if (Character.isDigit(password.charAt(c))) {
                hasNum = true;
            }
        }
        if (!length) {
            System.out.println("Password is too short. Please register again.");
            register();
        }
        if (!uppercase) {
            System.out.println("Password does not have an uppercase letter. Please register again.");
            register();
        }
        if (!lowercase) {
            System.out.println("Password does not have a lowercase letter. Please register again.");
            register();
        }
        if (!hasNum) {
            System.out.println("Password does not have a digit. Please register again.");
            register();
        }
        else {
            System.out.println("Your password satisfies the requirements! You can sign in below!");
        }
    }

    public static void signInUsername() {
        Scanner scan = new Scanner(System.in);
        System.out.print("It's time to sign in! Please Enter your Username: ");
        String usernameSignIn = scan.next();
        checkRegName(usernameSignIn);
    }

    public static void signInPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter your Password: ");
        String passwordSignIn = scan.next();
        checkRegPass(passwordSignIn);
    }

    public static void checkRegName(String username) {
        if (!(username.equals(usernameInput))) {
            System.out.println("Your username is not matched. Try again.");
            signInUsername();
        } else
            System.out.print("Your username is matched!");
    }

    public static void checkRegPass(String password) {
        if (!(password.equals(passwordInput))) {
            System.out.print("Your password is not matched! Try again.");
            signInPassword();
        } else {
            System.out.print("Your password is matched!");
        }
    }

    public static void readersInfo(String reader, Date date) {}

    public static String registeredName() { return usernameInput; }
}
