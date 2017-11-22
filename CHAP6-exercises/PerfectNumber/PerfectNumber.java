class PerfectNumber{
   
   public isPerfectNumber( int a){
      int i = 1;
      int sum = 0;
      
      while(i < a){
         if(a % i == 0){
            sum += i;
            ++i;
         } else
            ++i;
         
      }
      
      if(sum == a){
        System.out.println(a+" is a perfect number\n")
      } else{
      System.out.println(a+" is not a perfect number\n")
      }
      
   }
   
   public firstNPerfectNumbers(int n){
      for(int y = 1; y <= n; y++){
      
      int i = 1;
      int sum = 0;
      
      while(i < y){
         if(y % i == 0){
            sum += i;
            ++i;
         } else
            ++i;
         
      }
        if(sum == y)
          System.out.printf("%d ", y);
        else
         continue;
      
      }
   }
  
}
