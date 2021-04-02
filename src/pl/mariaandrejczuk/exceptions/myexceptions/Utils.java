package pl.mariaandrejczuk.exceptions.myexceptions;

public final class Utils {
    public static boolean isValidPassword(String pass1, String pass2) throws PasswordException {
        if (pass1.equals(pass2)) {
            return true;
        } else {
            throw new PasswordException();
        }
    }

    public static boolean isValidEmail(String email) throws EmailException {
        if (email.length() > 10) {
            return true;
        } else {
            throw new EmailException();
        }
    }
}

