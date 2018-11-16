import java.util.ArrayList;

class VariableLengthArgumentList{

    //ArrayList<Integer> newList = new ArrayList<Integer>();

	private int prdt = 1;

	public void myMethod(int... args ){

		for (int i : args ) {

			prdt *= i;
			
		}

		System.out.print("Product is " + prdt);

	}

	public void addToList(ArrayList<Integer> newList, int intList){

        newList.add(intList);

    }

}