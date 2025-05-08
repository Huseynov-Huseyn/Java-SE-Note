package src_homework.Lesson_6.HotelReservation;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Hotel reservation !");
        System.out.println("1 - Add Room , 2 - Booking Room , 3 - Canceling Bookings , 4 - List all Books , 5 - Exit");
        Hotel h = new Hotel();

        while (true) {
            System.out.print("Your choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    if (h.addRoom(Room.createRoom())) {
                        System.out.println("Your Room successfully added to system !");
                    } else {
                        System.out.println("Your Room can not add to system ! ");
                    }
                }
                case 2 -> {
                    System.out.print("Please enter your room id for booking: ");
                    int id = scan.nextInt();
                    System.out.println(h.bookRoom(id) ? "Room is booked successfully !" : "Room could not be booked. It may already be reserved.");
                }
                case 3 -> {
                    System.out.print("Please enter your room id for cancelling booking: ");
                    int id = scan.nextInt();
                    System.out.println(h.cancelBook(id) ? "Room book cancelled  !" : "Cant cancelled Booking");
                }
                case 4 -> h.listRooms();
                case 5 -> {
                    return;
                }
                default -> System.out.println("You entered the wrong number!  try again");
            }
        }
    }
}
