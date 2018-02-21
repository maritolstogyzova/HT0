import exception.IlluminanceTooMuchException;
import exception.SpaceUsageTooMuchException;

public class BuildingManager {
    public BuildingManager() {
    }

    public void build() throws IlluminanceTooMuchException, SpaceUsageTooMuchException{
        Building building = new Building("Building 1");
        building.addRoom("Room 1", 50, 2);
        building.addRoom("Room 2", 80, 4);
        building.getRoom("Room 1").add(new Lamp(150));
        building.getRoom("Room 1").add(new Chair("Chair \"So soft that you can drown in me\"", 1, 2));
        building.getRoom("Room 2").add(new Lamp(550));
        building.getRoom("Room 2").add(new Sofa("Sofa \"Lie on me gentle\"", 3, 4));
        building.getRoom("Room 2").add(new Table("Table \"Don't seat over here\"", 6));
        building.describe();
    }
}
