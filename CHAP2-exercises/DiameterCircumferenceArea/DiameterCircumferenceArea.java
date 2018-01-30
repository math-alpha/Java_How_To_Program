import java.util.Scanner;

class DiameterCircumferenceArea{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter the circle's radius please:");
		float radius = input.nextFloat();
      
      System.out.printf("%n%s: %.2f units%n%s: %.2f units%n%s: %.2f square units%n%n","Diameter", radius*2, "Circumference", Math.PI*radius*2, "Area", Math.PI*radius*radius);
       
   }
}
