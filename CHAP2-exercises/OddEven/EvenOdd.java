class OddEven{
   public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
       
     System.out.print("Enter a number please: ")
     int num = input.nextInt();
     
     System.out.printf("%d %s%n", num, (num % 2 = 0)? "is even" : "is odd" );
     
   }
}
