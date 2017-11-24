import java.util.Scanner;

class NegativePositiveZeroValues{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter five numbers seperated by space");
     int num1 = input.nextInt();
     int num2 = input.nextInt();
     int num3 = input.nextInt();
     int num4 = input.nextInt();
     int num5 = input.nextInt();
     int countNeg = 0;
     int countPos = 0;
     int countNul = 0;
     
     if(num1 > 0){
       ++countPos; 
     }
     if(num2 > 0){
       ++countPos; 
     }
     if(num3 > 0){
       ++countPos; 
     }
     if(num4 > 0){
       ++countPos; 
     }
     if(num5 > 0){
       ++countPos; 
     }
     
     
     if(num1 < 0){
       ++countNeg; 
     }
     if(num2 < 0){
       ++countNeg; 
     }
     if(num3 < 0){
       ++countNeg; 
     }
     if(num4 < 0){
       ++countNeg; 
     }
     if(num5 < 0){
       ++countNeg; 
     }
     
     
     if(num1 == 0){
       ++countNul; 
     }
     if(num2 == 0){
       ++countNul; 
     }
     if(num3 == 0){
       ++countNul; 
     }
     if(num4 == 0){
       ++countNul; 
     }
     if(num5 == 0){
       ++countNul; 
     }
     
     System.out.printf("%s: %d%n%s: %d%n%s: %d%n", "Postive numbers", countPos, "Negative numbers", countNeg, "Number of zeros", countNul);
     
  }
  
}
