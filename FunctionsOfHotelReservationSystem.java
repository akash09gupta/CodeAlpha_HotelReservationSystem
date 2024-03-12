package HotelReservationSystem;

import java.util.Scanner;

public class FunctionsOfHotelReservationSystem {
    static String acRooms[] = new String[10];
    static String nonAcRooms[] = new String[10];
    static Scanner sc = new Scanner(System.in);

    public static void availableRooms() {
        System.out.println("List of AC Rooms");
        for (int i = 0; i < acRooms.length; i++) {
            System.out.println("Available Room Numbers: " + (i + 1));
        }
        System.out.println("List of Non-AC Rooms");
        for (int i = 0; i < nonAcRooms.length; i++) {
            System.out.println("Available Room Numbers: " + (i + 1));
        }
    }

    public static void reserveRoom() {
        System.out.println("Press 1 for Reserving AC Rooms");
        System.out.println("Press 2 for Reserving Non-AC Rooms");
        System.out.println("Choose one:");
        int choice = sc.nextInt();
        System.out.println("Choose Room Number[1-10]: ");
        int roomNumber = sc.nextInt();
        if (choice == 1 && roomNumber >= 1 && roomNumber <= 10) {
            acRooms[roomNumber - 1] = "Reserved";
            if (paymentForRoom()) {
                System.out.println("Payment Successful");
                System.out.println("Your room number is reserved successfully.");
            }
        } else if (choice == 2 && roomNumber >= 1 && roomNumber <= 10) {
            nonAcRooms[roomNumber - 1] = "Reserved";
            if (paymentForRoom()) {
                System.out.println("Payment Successful");
                System.out.println("Your room number is reserved successfully.");
            }
        } else {
            System.out.println("Invalid choice or room number. Please try again.");
        }
    }

    public static boolean paymentForRoom() {
        System.out.println("Enter amount to pay");
        int pay = sc.nextInt();
        return pay == 500 || pay == 1000;
    }

    public static void detailsOfReservedRoom() {
        System.out.println("Reserved room details:");
    
        // Check if any rooms are reserved
        boolean reservedRoomFound = false;
        for (int i = 0; i < acRooms.length; i++) {
            if (acRooms[i] != null && acRooms[i].equals("Reserved")) {
                reservedRoomFound = true;
                System.out.println("AC Room Number: " + (i + 1));
                System.out.println("Room Type: AC");
            }
        }
    
        for (int i = 0; i < nonAcRooms.length; i++) {
            if (nonAcRooms[i] != null && nonAcRooms[i].equals("Reserved")) {
                reservedRoomFound = true;
                System.out.println("Non-AC Room Number: " + (i + 1));
                System.out.println("Room Type: Non-AC");
            }
        }
    
        if (!reservedRoomFound) {
            System.out.println("No rooms have been reserved yet.");
        }
    }
    
}
