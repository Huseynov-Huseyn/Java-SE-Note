package src_homework.Lesson_6.HotelReservation;

public class Hotel {
    Room[] rooms = new Room[6];

    public boolean addRoom(Room r) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = r;
                return true;
            }
        }
        System.out.println("Hotel is full!");
        return false;
    }

    public boolean bookRoom(int roomId) {
        Room room = findRoomById(roomId);
        if (room != null && !room.getBooked()) {
            room.setBooked(true);
            return true;
        } else {
            System.out.println("Room is booked");
            return false;
        }
    }

    public boolean cancelBook(int roomId) {
        Room room = findRoomById(roomId);
        if (room != null && room.getBooked()) {
            room.setBooked(false);
            return true;
        } else {
            System.out.println("Room is not booked");
            return false;
        }
    }


    public Room findRoomById(int roomId) {
        for (Room room : rooms) {
            if (room != null && room.getRoomNumber() == roomId) {
                return room;
            }
        }
        System.out.println("RoomId is invalid!");
        return null;
    }

    public void listRooms() {
        for (Room room : rooms) {
            if (room != null) {
                room.roomInformation();
            }
        }
    }

}
