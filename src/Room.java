public class Room {

    private static String roomNo;
    private static boolean isOccupied;
    private static double roomRent;


    public Room(String roomNo, boolean isOccupied, double roomRent) {
        this.roomNo = roomNo;
        this.isOccupied = isOccupied;
        this.roomRent = roomRent;
    }

    public static String getRoomNo() {
        return roomNo;
    }

    public static boolean isOccupied() {
        return isOccupied;
    }

    public static double getRoomRent() {
        return roomRent;
    }

    public static void setRoomNo(String roomNo) {
        Room.roomNo = roomNo;
    }

    public static void setIsOccupied(boolean isOccupied) {
        Room.isOccupied = isOccupied;
    }


}
