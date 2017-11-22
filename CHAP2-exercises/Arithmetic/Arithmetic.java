// Exo. 2.15: Arithmetic.java

import java.util.Scanner;
 
public class Arithmetic
{

public static void main(String[] args)
{

Scanner input = new Scanner(System.in);
int num1; 
int num2;  
System.out.print("Enter first integer: "); 
num1 = input.nextInt(); 
System.out.print("Enter second integer: ");
num2 = input.nextInt();

System.out.printf("%d + %d = %d%n", num1, num2, num1+num2); 
System.out.printf("%d * %d = %d%n", num1, num2, num2*num1);
System.out.printf("%d - %d = %d%n", num1, num2, num1-num2); 
System.out.printf("%d - %d = %d%n", num2, num1, num2-num1);
System.out.printf("%d / %d = %.3%n", num1, num2, num1/num2); 
System.out.printf("%d / %d = %.2f%n", num2, num1 num2/num1);
}
}
