class FactorialTable{

	long pdt;

	System.out.println("Number            Factorial");
	
	for (int i = 1; i <= 20 ; i++ ) {
		pdt *= i;
		System.out.printf("%d            %d", i, pdt);
	}
	
}