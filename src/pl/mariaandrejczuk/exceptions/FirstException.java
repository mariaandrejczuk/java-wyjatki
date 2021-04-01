package pl.mariaandrejczuk.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FirstException {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        // wyjątek nieoznaczony
        try {
            int result = a / b;
            result += 10;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nie dzielimy przez 0.");
        }
        //wyjątek oznaczony
        try {
            FileInputStream fileInputStream = new FileInputStream("/to/jest/sciezka/plik.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Taki plik nie istnieje.");
        }
    }
}
