import java.util.Scanner;

public class ParkingCharges{

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.print("Enter total number of praking hours: ");
       float hr = input.nextFloat();

       float Fee;
       if (hr > 3) {
           if ((2 + (hr - 3) * 0.5) <= 10) {
               Fee = (float) (2 + (hr - 3) * 0.5);
           } else {
               Fee = 10;
           }
       } else {
           Fee = (float) 2.0;
       }

       System.out.printf("%s%n%s %.2f%n", "Parking charge calculator", "Amount", Fee);

   }    

}
