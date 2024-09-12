public class Room {

    private String roomNo;
    private boolean isOccupied;
    private double roomRent;


    public Room(String roomNo, boolean isOccupied, double roomRent) {
        this.roomNo = roomNo;
        this.isOccupied = isOccupied;
        this.roomRent = roomRent;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }


}
