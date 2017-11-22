import java.util.Scanner;

public class ReversingDigits{

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      
      Syetem.out.print("Enter number:");
      int num = input.nextInt();
      
      int rev = 0, n = num, temp;
      
      while(num>0){
       temp = num % 10;
       rev = rev * 10 + temp;
       num = num / 10;
      }
      
      System.out.println("Number: "+n" Reverse: "+ rev);
      
   
   }    

}
