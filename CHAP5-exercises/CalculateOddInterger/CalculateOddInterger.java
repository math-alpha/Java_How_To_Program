import java.util.Scanner;

class CalculateOddInterger{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("The product of the odd numbers between1 and 15 ");
		int i = 15, product = 1; 
		while(i > 1) {
			product *=  (2*i - 1);
		}

		System.out.println(product+"\n");
	}
}