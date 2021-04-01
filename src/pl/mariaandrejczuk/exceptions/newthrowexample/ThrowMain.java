package pl.mariaandrejczuk.exceptions.newthrowexample;

import java.util.Scanner;

public class ThrowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            try {
                String month = Utils.monthNameByNumber(number);
                System.out.println(month);
            }catch (IllegalArgumentException e){
                System.out.println("Nie znaleziono miesiąca. ");
            }
        }while(true);
    }
}
