import java.util.Scanner;

class SaleCommissions{

	public static void main(String[] args) {

		int[] counter = new int[9];
		for (int i : counter ) {
			counter[i] = 0;
		}

		Scanner input = new Scanner();
		int check = 0;

		do{
			if (check == 0) {
				System.out.println("Enter worker's gross sale (-1 to exit):");
			}

			System.out.println("Enter next worker's gross sale (-1 to exit):");
			float amt = input.nextFloat();
			int salary =(int) ( 200 + (.9 * amt));
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

		}while(amt != -1);

		System.out.printf("%s5%d%n %s5%d%n %s5%d%n %s5%d%n %s5%d%n %s5%d%n %s5%d%n %s5%d%n %s5%d%n","200-299",counter[0],"300-399",counter[1],"400-499",counter[2],"500-599",counter[3],"600-699",counter[4],"700-799",counter[5],"800-899",counter[6],"900-999",counter[7],"1000-above",counter[8]);

	}

}