class DiameterCircumferenceArea{
   public static void main(String[] args){
     
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the circle's radius:");
      float radius = input.nextFloat();
      
      System.out.print("%s: %.2f%n%s: %.2f%n%s: %.2f%n","Diameter", radius*2, "Circumference", Math.PI*radius*2, "Area", Math.PI*radius*radius);
       
   }
}
