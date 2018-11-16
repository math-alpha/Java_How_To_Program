import java.util.Scanner;

public class Power{

   private static int intergerPower(int base, int power){
     if(power == 0){
        return 1;
     } else if(power == 1){
        return base;
     } else if(power > 1)
        return base * intergerPower(base, power-1);

     return 0;
   
   }

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter number please: ");
      int base = input.nextInt();
      
      System.out.println("Enter power  please: ");
      int power = input.nextInt();
      
      System.out.printf("%d^%d = %d%n",base, power, intergerPower(base,power));
      
   }    

}
