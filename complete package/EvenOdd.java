import java.util.Scanner;

class EvenOdd{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a number please: ");
		int num = input.nextInt();

		System.out.printf("%n%d %s%n%n", num, (num % 2 == 0)? "is even" : "is odd" );
     
   }
}
