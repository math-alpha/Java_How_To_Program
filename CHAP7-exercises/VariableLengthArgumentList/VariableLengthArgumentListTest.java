import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class VariableLengthArgumentListTest{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List int  myList = new ArrayList<>();
		VariableLengthArgumentListTest testClass = new VariableLengthArgumentListTest();

		do{
			System.out.print("enter a number(-1 to exit):");
			int var = input.nextInt();
			myList.testClass.addToList(var);
		}while(var != -1);

		testClass.myMethod();
	}

}