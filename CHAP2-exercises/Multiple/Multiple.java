class Multiple{
   public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
       
     System.out.print("Enter two numbers seperated by space please: ")
     int num = input.nextInt();
     int num1 = input.nextInt();
     
     System.out.printf("%d %s %d%n", num1, (num1 % num = 0)? "is a multiple" : "is not a multiple of", num );
     
   }
}
