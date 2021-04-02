package pl.mariaandrejczuk.exceptions.myexceptions;

public class MyExceptionMain {
    public static void main(String[] args) {
        String pass1 = "abc";
        String pass2 = "abc";

        try {
            Utils.isValidPassword(pass1, pass2);
            Utils.isValidEmail("msfsd@wp.pl");
            Utils.isValidPesel("98220120355");
        } catch (PasswordException | EmailException | PeselException e) {
            System.out.println(e.getMessage());
        }
    }
}
