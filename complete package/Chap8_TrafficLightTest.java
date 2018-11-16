public class Chap8_TrafficLightTest {

    public static void main(String[] args) {

        System.out.println("All light phases:\n");

        for (Chap8_TrafficLight color : Chap8_TrafficLight.values())
            System.out.printf("%-15s%-10s%s%n", color, color.getColour(), color.getDuration());

    }

}