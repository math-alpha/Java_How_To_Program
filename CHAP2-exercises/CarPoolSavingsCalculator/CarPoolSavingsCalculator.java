import java.util.Scanner;

class CarPoolSavingsCalculator{
   public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
       
       System.out.print("\nEnter number of miles driven per day: ");
       float DrivenMiles = input.nextFloat();
       
       System.out.print("Enter the unit cost of a gasoline gallon: ");
       float GallonPrice = input.nextFloat();
       
       System.out.print("On average, how many miles can you drive with a gallon ? Enter number: ");
       float AverageMile = input.nextFloat();
       
       System.out.print("Amount spent on parking the car: ");
       float ParkingFee = input.nextFloat();
       
       System.out.print("Amount spent on Tolls: ");
       float TollFee = input.nextFloat();
       
       System.out.printf("%n%s %.1f %s%n%n", "You spend", (TollFee + ParkingFee + ((DrivenMiles/AverageMile)*GallonPrice)), "FCFA which could be saved by POOLING the car");
       
   }
}
