import java.util.ArrayList;
import java.util.List;


class VariableLengthArgumentList{

    private  List <int> newList = new ArrayList<>();
    private  prdt = 1;

	public void myMethod(int... args ){

		for (int i : args ) {

			prdt *= completList[i];
			
		}

		System.out.print("Product of ");

	}

	private int addToList(int intList){

        return newList.add(intList);

    }

}