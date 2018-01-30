import java.util.*;

class SeparateDigitsInInteger{
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      double number;
      
      do{
      
          System.out.print("Enter a five digit number please ");
          number = input.nextInt();
          
        } while(number > 99999 || number < 10000);
        
      for(int i = 4; i >= 0; i--){ // original
             
             if(Math.pow(10,i) > number)
                System.out.print("0 ");
             else
                System.out.printf("%.0f ", ((number - (number % (Math.pow(10,i))) )/(Math.pow(10,i))));
             
             number = number % (Math.pow(10,i));
      }
       
       System.out.println();
   }
}
