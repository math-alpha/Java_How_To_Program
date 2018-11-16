class Display{
  
  public static void main(String[] args){

  	Shapes test = new Shapes();
    
    System.out.print("\n");

    for(int i = 1; i <= 9; i++){
       test.cube(i);
       test.circle(i);
       test.arrow(i);
       test.diamond(i);
    }

    System.out.print("\n");
    
  }
  
}
