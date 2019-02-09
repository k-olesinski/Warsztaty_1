package pl.kolesinski.zadanie2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String arg[]) {
        Integer[] lottoNumbers = new Integer[49];
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = i + 1;
        }
        Collections.shuffle(Arrays.asList(lottoNumbers));
        Integer[] winNumbers = Arrays.copyOf(lottoNumbers, 6);

        Integer[] numbers = new Integer[6];
        System.out.println("podaj 6 różnych liczb całkowitych: ");
        int i = 0;
        while (i < numbers.length){
            int newNumber = giveNumber();
            if (newNumber < 1 || newNumber > 49) {
                System.out.println("liczba spoza zakresu");
                continue;
            }
            if (Arrays.asList(numbers).contains(newNumber)) {
                System.out.println("taka liczba już wystąpiła");
                continue;
            }
            numbers[i] = newNumber;
            i++;
        }
        Arrays.sort(numbers);
        Arrays.sort(winNumbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(winNumbers));

        int win = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (Arrays.asList(numbers).contains(winNumbers[j])){
                win++;
            }
        }
        System.out.println("liczba trafionych numerów: " + win);
    }

    static int giveNumber() {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("podaj liczbę typu int");
        }
        return scan.nextInt();
    }
}
