public class Furniture implements SpaceUsage {
    private String name;
    private double minSpace;
    private double space;

    public Furniture(String furnitureName, double space) {
        this.name = furnitureName;
        this.space = space;
    }

    public Furniture(String furnitureName, double minSpace, double space) {
        this.name = furnitureName;
        this.minSpace = minSpace;
        this.space = space;
    }

    public void describeFurniture(){
        if (minSpace != 0) {
            System.out.println("   " + name + "(space from " + minSpace + " to " + space + " m^2)");
        }
        else {
            System.out.println("   " + name + "(space " + space + " m^2)");
        }
    }

    public double getSpace() {
        return space;
    }
    public void setSpace(double space) {
        this.space = space;
    }
}
