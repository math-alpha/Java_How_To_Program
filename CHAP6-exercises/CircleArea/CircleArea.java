import java.util.Scanner;

class Hypotenuse{
   
   public double circleArea(double r){
      
      return Math.PI * r * r;
   
   }
   
   public static void main(String[] args){
    
      Scanner input = new Scanner();
      System.out.println("Enter the radius of the circle: ");
      
      double radius = input.nextDouble();
      double area = circleArea(radius);
      
      System.out.println("Area: "+area"\n");
      
   }

}
