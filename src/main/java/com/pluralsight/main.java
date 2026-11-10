package com.pluralsight;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel("Grand Hotel", 10, 20);

        System.out.println("How many rooms?");
        int roomCount = scanner.nextInt();

        System.out.println("Suite? (true/false)");
        boolean suite = scanner.nextBoolean();

        boolean booked = hotel.bookRoom(roomCount, suite);

        if (booked) {
            System.out.println("Rooms successfully booked!");
        } else {
            System.out.println("Not enough rooms available or invalid request.");
        }
    }
}