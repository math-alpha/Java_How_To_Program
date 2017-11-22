import java.util.Scanner;

public class Power{

   public int intergerPower(base,power){
     if(power == 0){
        return 1;
     } else if(power == 1){
        return base;
     } else if(power > 1)
        return base * IntergerPower(base, power-1);
   
   }

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter number please: ")
      int base = input.nextInt();
      
      System.out.println("Enter power  please: ")
      int power = input.nextInt();
      
      System.out.printf("%d^%d = %d%n",base, power, IntergerPower(base,power));
      
   }    

}
