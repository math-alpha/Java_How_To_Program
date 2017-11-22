import java.util.scanner

class PrimeNumbers{
   
   public isPrime(int num){
     flag = 1;
    
     for(int i = 1; i <= (int)(num/2); i++){
         if(num % i == 0){
           flag = 0;
           break;
         }else
          
       }
       
       if(flag == 1){
         System.out.println(n+" is a prime");
       } else
         System.out.println(n+" is not a prime");
   }
   
   public void PrintPrimes(int n){
     
     for(int num = 2; num <= n; num++){
        flag = 1;
    
     for(int i = 1; i <= (int)(num/2); i++){
         if(num % i == 0){
           flag = 0;
           break;
         }else
          
       }
       
       if(flag == 1){
         System.out.println(n+" ");
     }
   }
   
}
