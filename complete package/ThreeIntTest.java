import java.util.Scanner;

public class ThreeIntTest{

    public static void main() {

        Scanner input = new Scanner(System.in);

        float a;
        float b;
        float c;
        do {

            System.out.print("Enter the three sides of a triangle seperated by space");
            a = input.nextFloat();
            b = input.nextFloat();
            c = input.nextFloat();

        } while (a <= 0 || b <= 0 || c <= 0);

        if ((a * a) == (b * b + c * c) || (b * b) == ((a * a) + (c * c)) || (c * c) == ((a * a) + (b * b))) {
            System.out.print("The input values represent a right angle triangle");
        } else
            System.out.print("The input values represent can not a right angle triangle");

    }
}
