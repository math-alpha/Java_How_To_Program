import java.util.ArrayList;
import java.util.Scanner;

class VariableLengthArgumentListTest{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		VariableLengthArgumentList testClass = new VariableLengthArgumentList();

		int var;
		do {
			System.out.print("enter a number(-1 to exit):");
			var = input.nextInt();
			testClass.addToList(myList, var);
		} while (var != -1);

	}

}