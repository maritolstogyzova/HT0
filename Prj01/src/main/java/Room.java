import exception.IlluminanceTooMuchException;
import exception.SpaceUsageTooMuchException;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private double space;
    private double spaceUsage;
    private int windows;
    private int illumination;
    private List<Illuminance> lamps;
    private List<SpaceUsage> furnitureList;

    public Room(String roomName, double space, int windows) {
        this.name = roomName;
        this.space = space;
        this.spaceUsage = 0;
        this.windows = windows;
        this.illumination = windows * 700;
        lamps = new ArrayList<Illuminance>();
        furnitureList = new ArrayList<SpaceUsage>();
    }

    public void add(Illuminance ligth) throws IlluminanceTooMuchException {
        if (illumination > 300 && illumination < 4000) {
            lamps.add(ligth);
            illumination += ligth.getIllumination();
        }
        else if (illumination >= 4000){
            throw new IlluminanceTooMuchException("Illuminance too much (over 4000 LX).");
        }
    }

    public void add(SpaceUsage furniture) throws SpaceUsageTooMuchException {
        if (spaceUsage < (space * 0.7)) {
            furnitureList.add(furniture);
            spaceUsage += furniture.getSpace();
        }
        else {
            throw new SpaceUsageTooMuchException("You have used all possible free space in this room.");
        }
    }

    public void describeRoom() {
        System.out.println(" " + name);
        System.out.print("  Illuminance = " + illumination + " (" + windows + " windows of 700 LX");
        if (!lamps.isEmpty()) {
            System.out.println(", lamps: ");
            for (Illuminance lamp : lamps) {
                System.out.print(lamp.getIllumination() + " LX;");
            }
        }
        else {
            System.out.println();
        }
        System.out.println("  Space = " + space + " m^2 (occupied " + spaceUsage + " m^2, free " + (space - spaceUsage) +
                " m^2 or " + (((space - spaceUsage) / space) * 100) + "% of space;");
        if (!furnitureList.isEmpty()) {
            System.out.println("  Furniture:");
            for (SpaceUsage furniture : furnitureList) {
                furniture.describeFurniture();
            }
        }
        else {
            System.out.println("  No furniture");
        }
    }

    public String getName() {
        return name;
    }

    public double getSpace() {
        return space;
    }
    public void setSpace(double space) {
        this.space = space;
    }

    public int getWindows() {
        return windows;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public List<Illuminance> getLamps() {
        return lamps;
    }

    public List<SpaceUsage> getFurnitureList() {
        return furnitureList;
    }
}
