import java.util.Scanner;



public class ExponentialPowers{

   int facto(int a){
  if(a == 1 || a == 0)
    return 1;
  else
    return a * facto(a-1);
    
}
   
   public static void main(String[] args){
      
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter a interger: ");
       int num = input.nextInt();
      
       float e = 0.0, e1 = 0.0;
      
       for(int i = 1; i <= 100; i++){
          e += 1/(facto(i-1));
          e1 += Math.pow(num,i)/facto(i);
       }
       
       System.out.println("e ~ "+e);
       System.out.println("e^"+ num + "~ "+e);
   }
   
}
