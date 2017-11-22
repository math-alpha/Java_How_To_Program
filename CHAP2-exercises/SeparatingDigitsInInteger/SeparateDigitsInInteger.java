class SeparateDigitsInInteger{
   public static void main(Static[] args){
      
      Scanner input = new Scanner(System.in);
      
      do{
      
          System.out.print("Enter a five digit number please ");
          int number = input.nextInt();
          
        } while(number > 99999 || number < 10000);
        
      for(int i = 4; i => 0; i--){ // original
             if(Math.pow(10,i) > number)
                System.out.print("0 ");
             else
             System.out.printf("%d ", number/(Math.pow(10,i)));
             number %= Math.pow(10,i);
      }
   }
}
