import java.util.Scanner;

public class RoundingNumber{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      float x = input.nextFloat();
      
      y = Math.floor(x + 0.5);
      
      System.out.printf("%s: %.2f%n%s: %.2f", "Initial number", x, "rounded number", y);
   
   }    

}
