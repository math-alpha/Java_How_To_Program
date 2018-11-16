// Exo. 2.15: Arithmetic.java

import java.util.Scanner;
 
public class Arithmetic
{

public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
float num1; 
float num2;  
System.out.printf("Enter first integer: "); 
num1 = input.nextFloat(); 
System.out.printf("Enter second integer: ");
num2 = input.nextFloat();

System.out.printf("%.0f + %.0f = %.0f%n", num1, num2, num1+num2); 
System.out.printf("%.0f * %.0f = %.0f%n", num1, num2, num2*num1);
System.out.printf("%.0f - %.0f = %.0f%n", num1, num2, num1-num2); 
System.out.printf("%.0f - %.0f = %.0f%n", num2, num1, num2-num1);
System.out.printf("%.0f / %.0f = %.3f%n", num1, num2, num1/num2); 
System.out.printf("%.0f / %.0f = %.2f%n", num2, num1, num2/num1);
}
}
