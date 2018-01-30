class Shapes{

  public void space(int i ){
    for(int y = 1; y <= i; y++){
      System.out.print(" ");
    }
  }
  
  public void str(){
    System.out.print("*");
  }
  
  public void cube(int i){
    if(i == 1 || i == 9){
      System.out.print("********* ");
    } else
      System.out.print("*       * ");
  }
  
    public void circle(int i){
    if(i == 1 || i == 9){
       System.out.print("   ***    ");
    } else if(i == 2 || i == 8){
       System.out.print(" *     *  ");
    } else
       System.out.print("*       * ");
  }
  
  public void arrow(int i){
    if(i == 2){
       System.out.print(" ***  ");
    } else if(i == 3){
       System.out.print("***** ");
    } else
       System.out.print("  *   ");
  }
  
 public void diamond(int i){
    if(i == 1 || i == 9){
       System.out.print("    *     ");
       System.out.print("\n");
    } else if(i <= 5){ // a liitle bit of maths :)
       space(5 - i);
       str();
       space((2*i) - 3);
       str();
       space(5 - i);
       System.out.print("\n");
    } else{
       space(i - 5);
       str();
       space(17 - (2*i));
       str();
       space(i - 5);
       System.out.print("\n");
    }
 } 
  
}
