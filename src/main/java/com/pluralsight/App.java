package com.pluralsight;

public class App {

    public static void main(String[] args) {

        // Moped
        Moped slowRide = new Moped("Red", 2, 20, 5);


        // Car
        Car familyCar = new Car("Blue", 5, 100, 15);

        // SemiTruck
        SemiTruck bigRig = new SemiTruck("Black", 2, 10000, 100);

        // Hovercraft
        Hovercraft hoverOne = new Hovercraft ("Silver", 4, 300, 20);

        // Display Values
        System.out.println(slowRide.getColor());
        System.out.println(familyCar.getFuelCapacity());
    }
}
