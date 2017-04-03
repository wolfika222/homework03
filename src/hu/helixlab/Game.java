package hu.helixlab;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Hp_Workplace on 2017.04.03..
 */
public class Game {


    public static void playBarchobaWithNumbers() {
        Random number = new Random();
        int pc = number.nextInt(50) + 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = -10; i < 0; ++i) {
            System.out.println("Következő tipp(lehetőségek száma " + i + "):");
            int input = scanner.nextInt();
            if (i > -2) {
                System.out.println("Nem nyertél!");
            } else if (pc == input) {
                System.out.println("Játékos nyert!");
                break;
            } else if (pc > input) {
                System.out.println("A szám kisebb.");
            } else {
                System.out.println("A szám nagyobb.");
            }

        }
    }
}
