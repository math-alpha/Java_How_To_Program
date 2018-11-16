import java.util.Scanner;

class Hypotenuse{
   
   static double hypCal(double a, double b){
      
      double c = Math.sqrt(a*a + b*b);
      return c;
   
   }
   
   public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the two sides of a triangle and i will find the hypotenuse of the corresponding rigth angle triangle\n Sides:");
      
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double hypo = hypCal(side1,side2);
      
      System.out.println("Hypotenus: "+hypo+"\n");
      
   }

}
