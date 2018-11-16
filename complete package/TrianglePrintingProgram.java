class TrianglePrintingProgram{
	
	public static void triangleA(){
		System.out.println();
		System.out.print("Triangle (a)\n");
	  for (int i = 1; i <= 10 ; i++ ) {
	  	  for (int y = 1; y <= i ; y++) {
	  	  	System.out.print("*");
	  	  }
	  	  System.out.println();
	  }
	}
    
    public static void triangleB(){
    	System.out.println();
    	System.out.print("Triangle (b)\n");
    	for (int i = 10; i >= 1 ; i-- ) {
	  	  for (int y = 1; y <= i ; y++) {
	  	  	System.out.print("*");
	  	  }
	  	  System.out.println();
	  }
    }

    public static void triangleC(){
    	System.out.println();
    	System.out.print("Triangle (c)\n");
    	for (int i = 10; i >= 1 ; i-- ) {
	  	  
	  	  for (int y = 10; y > i ; y--) {
	  	  	System.out.print(" ");
	  	  }
	  	  
	  	  for (int y = 1; y <= i ; y++) {
	  	  	System.out.print("*");
	  	  }
	  	  System.out.println();
	  }
    }

    public static void  triangleD(){
    	System.out.println();
    	System.out.println("Triangle (d)\n");
    	for (int i = 1; i <= 10 ; i++ ) {
	  	  
	  	  for (int y = 10; y > i ; y--) {
	  	  	System.out.print(" ");
	  	  }
	  	  
	  	  for (int y = 1; y <= i ; y++) {
	  	  	System.out.print("*");
	  	  }
	  	  System.out.println();
	  }
    }

    public static void main(String[] args) {


    	triangleA();
    	triangleB();
    	triangleC();
    	triangleD();
    	
    }


}