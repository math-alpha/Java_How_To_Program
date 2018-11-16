import java.util.Scanner;

public class Triangle{

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

        if (a > (b + c) || b > (a + c) || c > (a + b)) {
            System.out.print("The input values do not represent a triangle");
        } else
            System.out.print("The input values represent a triangle");

    }
}
