package pl.mariaandrejczuk.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Insert number 1: ");
            a = scanner.nextInt();
            System.out.println("Insert number 2: ");
            b = scanner.nextInt();
            scanner.nextLine();
            System.out.println(a / b);

            System.out.print("Insert path to file: ");
            String path = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(path);

        }catch(FileNotFoundException e){
            System.out.println("Does not exists");
        }catch(ArithmeticException e){
            System.out.println("Do not divide by 0.");
        }
    }
}
