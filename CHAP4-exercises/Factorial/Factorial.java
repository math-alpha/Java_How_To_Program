import java.util.Scanner;



public class Factorial{

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
       System.out.println(num + "! = " + Factorial(num));       
   }
   
}
