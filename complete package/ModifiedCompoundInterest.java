import java.util.concurrent.atomic.AtomicInteger;

public class ModifiedCompoundInterest
{
   public static void main(String args[])
   {
      double amount;
      double principal = 1000.0;

      for (AtomicInteger count = new AtomicInteger(5); count.get() <= 10 ; count.getAndIncrement()) {
         
         if( count.get() == 1){
            System.out.println("The Calculations done with an interest of "+ count.get() /100);
         }
         
         System.out.printf("%s%20s%n", "Year", "Amount on deposit");

         for (int year = 1; year <= 10; year++) 
         {
            amount = principal * Math.pow(1.0 + count.get(), year);

            System.out.printf("%4d%,20.2f%n", year, amount);
         } 
      }
   }
}

