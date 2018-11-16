import java.util.Scanner;

public class Palindrome{
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      int flag = 0;
       int num;
      
      do{ 
          
          if(flag == 1){
            System.out.print("Sorry re-enter the number\n");
          }
          
          System.out.print("Enter a five digit number");
          num = input.nextInt();
          
          }while(num > 99999 || num < 10000);
    int temp, reverse = 0, n = num;
    
    while( num > 0){
      temp = num % 10;
      reverse = reverse * 10 + temp;
      num /= 10;
    }
    
    if(reverse == n){
      System.out.println(n+" is a plalindrome number");
    } else
      System.out.println(n+" is not a palindrome number");
}
}
