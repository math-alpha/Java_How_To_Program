import java.util.Scanner;

class BodyMassIndexCalculator{
   
   public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("BMI VALUES\nUndeweight: less than 18.5\nNormal:       between 18.5 and 24.9\nOverweight:  between 25 and 29.9\nObese:      30 or greater\n\nSo let's know your status :)\nEnter Weight in Kilograms:");
     float mass = input.nextFloat();
     
     System.out.print("Enter height in metres:");
     float height = input.nextFloat();
     
     System.out.printf("%s %.1f%n","Your BMI Value is", mass/(height*height));
     
   }
  
}
