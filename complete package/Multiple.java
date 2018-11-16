import java.util.Scanner;

class Multiple{
   public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
       
     System.out.print("\nPlease enter two numbers seperated by space please: ");
     int num = input.nextInt();
     int num1 = input.nextInt();
     
     System.out.printf("%n%d %s %d%n%n", num1, ((num1 % num) == 0)? "is a multiple" : "is not a multiple of", num );
     
   }
}
