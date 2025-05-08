package src_homework.Lesson_6.HotelReservation;

import java.util.Scanner;

public class Room {
    static Scanner scan = new Scanner(System.in);
    private int roomNumber;
    private String roomType;
    private boolean isBooked;

    public Room() {
    }


    public static Room createRoom() {
        Room r = new Room();
        System.out.print("Please enter your room number : ");
        r.setRoomNumber(scan.nextInt());
        scan.nextLine();

        System.out.print("Please enter your room type : ");
        r.setRoomType(scan.nextLine());

        System.out.print("Is room booked (Yes/No): ");
        r.setBooked(scan.nextLine().equalsIgnoreCase("yes"));
        return r;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void roomInformation() {
        System.out.println("Room number : " + roomNumber + ", Room type : " + roomType + ", Room booked : " + ((isBooked) ? "yes" : "no"));
    }
}
