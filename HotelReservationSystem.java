package HotelReservationSystem;

import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // AvailableRooms AvailableRooms = new AvailableRooms(); // Create an instance of AvailableRooms
        while (true) {
            System.out.println("Press 1 for checking Available Rooms");
            System.out.println("Press 2 for reserving Available rooms");
            System.out.println("Press 3 for viewing your details of your room");
            System.out.println("Press 4 for exiting from the app");
            System.out.println("Choose Your Choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FunctionsOfHotelReservationSystem.availableRooms(); // Call the availableRooms method using the instance
                    break;
                case 2:
                    FunctionsOfHotelReservationSystem.reserveRoom(); // Call the reserveRoom method using the instance
                    break;
                case 3:
                    FunctionsOfHotelReservationSystem.detailsOfReservedRoom(); // Call the detailsOfReservedRoom method using the instance
                    break;
                case 4:
                    System.out.println("Thank You for using our Application");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
