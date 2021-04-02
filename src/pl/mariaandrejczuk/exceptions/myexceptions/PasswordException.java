package pl.mariaandrejczuk.exceptions.myexceptions;

public class PasswordException extends Exception {
    public PasswordException() {
        super("Password incorrect");
    }
}
