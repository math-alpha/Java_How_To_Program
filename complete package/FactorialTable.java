class FactorialTable{

	static long pdt;

	public static void main(String[] args){
		System.out.println("Number            Factorial");
	
		for (int i = 1; i <= 20 ; i++ ) {
			pdt *= i;
		System.out.printf("%d            %d", i, pdt);
	}
	}
	
}