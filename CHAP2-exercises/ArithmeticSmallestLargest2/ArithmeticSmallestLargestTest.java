import java.util.Scanner;

class ArithmeticSmallestLargestTest{

   public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   ArithmeticSmallestLargest test = new ArithmeticSmallestLargest();
   int num1;
   int num2;
   int num3;
   int num4;
   int num5;
   System.out.print("\nEnter five integers seperated with space: "); // prompt
   num1 = input.nextInt();
   num2 = input.nextInt();
   num3 = input.nextInt();
   num4 = input.nextInt();
   num5 = input.nextInt();
   
   System.out.printf("%n%s: %d%n%s: %d%n%n","Smallest", test.getMin(num1,num2,num3,num4,num5), "Largest", test.getMax(num1,num2,num3,num4,num5));
}
}
