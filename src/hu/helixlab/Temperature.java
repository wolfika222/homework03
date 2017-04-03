package hu.helixlab;

import java.util.Scanner;

/**
 * Created by Hp_Workplace on 2017.04.03..
 */
public class Temperature {

    private int[] arrayTemp = new int[10];
    private int min;
    private int max;
    Scanner input = new Scanner(System.in);

    public void getTemperatureDataFromConsole() {

        for (int i = 0; i < arrayTemp.length; ++i) {
            System.out.println("Kérek egy hőmérsékletet: ");
            int number = input.nextInt();
            arrayTemp[i] = number;
        }
    }

    public void printHighestTemperature() {
        max = arrayTemp[0];
        for (int i = 1; i < arrayTemp.length; ++i) {
            if (arrayTemp[i] > max) {
                max = arrayTemp[i];
            }
        }
        System.out.println("A legmagasabb hőmérséklet: " + max);
    }

    public void printLowestTemperature() {
        min = arrayTemp[0];
        for (int i = 1; i < arrayTemp.length; ++i) {
            if (arrayTemp[i] < min) {
                min = arrayTemp[i];
            }
        }
        System.out.println("A legalacsonyabb hőmérséklet: " + min);
    }

}
