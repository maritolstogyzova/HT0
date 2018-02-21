import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private List<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<Room>();
    }

    public void addRoom(String roomName, double space, int windows) {
        rooms.add(new Room(roomName, space, windows));
    }

    public Room getRoom(String roomName) {
        for (Room room : rooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        System.out.println("You've entered wrong room name.");
        return null;
    }

    public void describe() {
        System.out.println(name);
        for (Room room : rooms) {
            room.describeRoom();
        }
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
