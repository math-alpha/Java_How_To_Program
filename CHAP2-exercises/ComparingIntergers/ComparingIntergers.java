// Exo. 2.16: ComparingIntergers.java
// Compare integers using if statements, relational operators
// and equality operators.

import java.util.Scanner;

public class ComparingIntergers
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
if (num1 == num2)
System.out.printf("%d and %d are equal %n", num1, num2);
else
System.out.printf("%d %s%n", (num1<num2)? num1 : num2, "is larger");
}
}