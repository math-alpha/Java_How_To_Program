import java.util.Random;
import java.util.Scanner;

class CoinToss{
   
   public String Toss(){
   
       Random r = new Ramdom();
       int t = 1 + r.nextInt(2);
   
       if(t == 1)
         return 'H';
       else
         return 'T';
  
   
   public static void main(String[] args){
      
      int head = 0;
      int tail = 0;
      int count = 0;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Welcome to the tosssingg game !\nEnter 1 to toss the coin and zero to exit");
      int n = input.nextInt();
      
      if(n == 1){
         String ans = Toss();
         if( ans == 'H')
           ++head;
         else
           ++tail;
       ++count;      
      } else
      
       System.out.println("Exiting...\nNumber of toss: "+count+"Heads: "+head+"Tails: " +tail+"\n");
   
      
   }
}
