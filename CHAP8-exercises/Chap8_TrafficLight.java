public enum Chap8_TrafficLight {

    // declare constants of enum type
    PEDESTRIAN("RED", "15"),
    CARS("GREEN", "10"),
    TRANSIT("ORANGE", "2");

    // instance fields
    private final String colour;
    private final String duration;

    // enum constructor
    Chap8_TrafficLight(String colour, String duration) {
        this.colour = colour;
        this.duration = duration;
    }

    public String getColour() {
        return colour;
    }

    public String getDuration() {
        return duration;

    }

}