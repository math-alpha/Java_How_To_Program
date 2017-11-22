import java.util.Scanner;

public class SquareOfAsterisks{
   
   public static void main(){
   
      Scanner input = new Scanner(System.in);
      do{
        System.out.print("Enter side lenght:");
        int length = input.nextInt();
      }while(length < 1 || length > 20)
   
      star(length);
      
      for(int k = 1; k <= length-2; k++){
         star(1);
         space(length-2);
         star(1);
      }
      start(length)
   
   }
   
   public static space(int y){
     for(int k = 1; k <= y; k++)
       System.out.print(" ");
   }
   
   public static star(int n){
     for(int k = 1; k <= y; k++)
       System.out.print("*");
   }
   
}
