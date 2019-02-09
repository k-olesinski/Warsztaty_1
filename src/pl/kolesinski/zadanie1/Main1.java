package pl.kolesinski.zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String args[]) {
        Random random = new Random();
        int computerRandomNumber = random.nextInt(101)+1;

        System.out.print("zgadnij liczbę od 1 do 100: ");
        int number = getNumber();

        while (number != computerRandomNumber) {
            if (number < computerRandomNumber) {
                System.out.println("za mało");
                System.out.println("spróbuj jeszcze raz: ");
                number = getNumber();
            } else {
                System.out.println("za dużo");
                System.out.println("spróbuj jeszcze raz: ");
                number = getNumber();
            }
        }
        System.out.println("to jest szukana liczba!!");
    }
    static int getNumber() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()){
            scan.next();
            System.out.println("to nie jest liczba \n podaj liczbę: ");
        }
        int number = scan.nextInt();
        return number;
    }
}
