package pl.mariaandrejczuk.exceptions.throwsexamples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        try {
            int result = Math.div(num1, num2);
            System.out.println(num1 + "/" + num2 + "=" + result);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0.");
        }*/
        int i = 0;
        String[] tab = new String[1];
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Podaj ulubiony kolor: ");
            for (i = 0; i < 1; i++) {
                tab[i] = input.nextLine();
            }
        System.out.println(tab[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dlaczego akurat "+tab[0]+"??");
        }
    }
}
