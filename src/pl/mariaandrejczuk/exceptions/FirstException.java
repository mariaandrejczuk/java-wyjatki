package pl.mariaandrejczuk.exceptions;

import java.io.FileInputStream;

public class FirstException {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        // wyjątek nieoznaczony
        int result = a / b;
        result += 10;
        System.out.println(result);

        //wyjątek oznaczony
        FileInputStream fileInputStream = new FileInputStream("/to/jest/sciezka/plik.txt");
    }
}
