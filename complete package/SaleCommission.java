import java.util.Scanner;

class SaleCommission{

	public static void main(String[] args) {

		float amt;   // NOTE program didn't work when intialised in the do while loop. Got "undefined symbole amt"

		int[] counter = new int[9];
		for (int i : counter ) {
			counter[i] = 0;
		}

		Scanner input = new Scanner(System.in);
		int check = 0;

		do{
				if (check == 0) {
					System.out.println("Enter worker's gross sale (-1 to exit):");
				} else
					System.out.println("Enter next worker's gross sale (-1 to exit):");

				amt = input.nextFloat();

				int salary = (int) ( 200 + (.9 * amt));
				if (salary < 299) {
			 		++counter[0];
			 	} else if (salary < 399) {
			 		++counter[1];
			 	} else if (salary < 499) {
			 		++counter[2];
			 	} else if (salary < 599) {
			 		++counter[3];
			 	} else if (salary < 699) {
			 		++counter[4];
			 	} else if (salary < 799) {
			 		++counter[5];
			 	} else if (salary < 899) {
			 		++counter[6];
			 	} else if (salary < 999) {
			 		++counter[7];
			 	} else if (salary >= 1000 ) {
			 		++counter[8];
			 	}
			 	++check;

				//int amt1 = (int)amt;

		}while( (int) amt != (1-2) );

		System.out.printf("%s%5d%n %s%5d%n %s%5d%n %s%5d%n %s%5d%n %s%5d%n %s%5d%n %s%5d%n %s%5d%n","200-299",counter[0],"300-399",counter[1],"400-499",counter[2],"500-599",counter[3],"600-699",counter[4],"700-799",counter[5],"800-899",counter[6],"900-999",counter[7],"1000-above",counter[8]);

	}

}
