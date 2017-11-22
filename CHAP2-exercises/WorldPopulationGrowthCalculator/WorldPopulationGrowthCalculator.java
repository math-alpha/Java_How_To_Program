import java.util.Scanner;

class WorldPopulationGrowthCalculator{

   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter current country population:");
      double pop = input.nextDouble();
      System.out.print("Enter estimated growth rate:");
      double rate = input.nextDouble();
   }
   
   for(int i = 1; i <= 5; i++){
      pop = pop + rate*pop;
      System.out.printf("%s %d %s %.0e%n", "Estimated population after", i, "year[s] is", pop );
   }
   
}
