public class Lamp implements Illuminance {
    private int illumination;

    public Lamp(int illumination) {
        this.illumination = illumination;
    }

    public int getIllumination() {
        return illumination;
    }
    public void setIllumination(int illumination) {
        this.illumination = illumination;
    }
}
