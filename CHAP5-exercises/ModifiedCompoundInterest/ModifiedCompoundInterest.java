public class ModifiedCompoundInterest 
{
   public static void main(String args[])
   {
      double amount;
      double principal = 1000.0;

      for (int count = 5; count <= 10 ; count++ ) {
         
         if( i == 1){
            System.out.println("The Calculations done with an interest of "+count/100);
         }
         
         System.out.printf("%s%20s%n", "Year", "Amount on deposit");

         for (int year = 1; year <= 10; year++) 
         {
            amount = principal * Math.pow(1.0 + count, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
         } 
      }
   }
}

