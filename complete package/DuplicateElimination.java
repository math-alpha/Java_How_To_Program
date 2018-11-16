import java.util.Scanner;

class DuplicateElimination{

	public static void main(String[] args) {

		int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++ ) {

        	System.out.print("\nEnter a number between 10-100 (inclusive)");
        	int t = input.nextInt();
        	if (t<10 || t>100) {
        		--i;
        		continue;
        	} else {
        		array[i] = t;
        	}
        	for (int y = 0; y <= i ; y++ ) {

        		System.out.print(" "+array[y]);
        		
        	}
        	
        }
        System.out.println();
		
	}

}