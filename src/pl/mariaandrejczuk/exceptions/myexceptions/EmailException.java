package pl.mariaandrejczuk.exceptions.myexceptions;

public class EmailException extends Exception {
    public EmailException() {
        super("Email incorrect.");
    }
}
