package hu.helixlab;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

/*
        User user1 = new User("Jóska");
        System.out.println(user1.toString());


        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            System.out.println((new User("Gábor")).toString());
        }

        System.out.println(PasswordGenerator.generatePassword(10));
        */
        //Game.playBarchobaWithNumbers();

        Temperature temperature = new Temperature();
        temperature.getTemperatureDataFromConsole();
        temperature.printHighestTemperature();
        temperature.printLowestTemperature();
    }
}
