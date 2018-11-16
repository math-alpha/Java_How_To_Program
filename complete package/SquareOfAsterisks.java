import java.util.Scanner;

public class SquareOfAsterisks{
   
   public static void main(){
   
      Scanner input = new Scanner(System.in);
       int length;
      do{
        System.out.print("Enter side lenght:");
        length = input.nextInt();// declaring it here gives it a local scope
      }while(length < 1 || length > 20);
   
      star(length);
      
      for(int k = 1; k <= length-2; k++){
         star(1);
         space(length-2);
         star(1);
      }
      star(length);
   
   }
   
   public static void space(int y){
     for(int k = 1; k <= y; k++)
       System.out.print(" ");
   }
   
   public static void star(int n){
     for(int k = 1; k <= n; k++)
       System.out.print("*");
   }
   
}
