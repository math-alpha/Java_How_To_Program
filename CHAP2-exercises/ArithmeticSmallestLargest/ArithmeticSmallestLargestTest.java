import java.util.*;
import java.lang.*;

class ArithmeticSmallestLargestTest{

   public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   ArithmeticSmallestLargest test = new ArithmeticSmallestLargest();
   int num1;
   int num2;
   int num3;
System.out.print("Enter three integers seperated with space: "); // prompt
num1 = input.nextInt();
num2 = input.nextInt();
num3 = input.nextInt();
   float num4 = (num1+num2+num3)/3;
System.out.printf("%n%s: %d%n%s: %.2f %s%n%s: %d%n%s: %d%n%s: %d%n%n","Sum",(num1+num2+num3), "Average",num4, "(Issue)", "Product", (num1*num2*num3) ,"Smallest", test.getMin(num1,num2,num3), "Largest", test.getMax(num1,num2,num3));
}
}
