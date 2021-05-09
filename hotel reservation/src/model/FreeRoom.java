package model;

public class FreeRoom extends Room{


    public FreeRoom(String roomNumber,  RoomType roomType) {
        super(roomNumber, 0.0, roomType);
    }

    @Override
    public String toString() {
        return "Free room details - Room Number: " + roomNumber + "  Price: " + price +
                "  Room Type: " + roomType;
    }
}
