import java.util.Scanner;

public class InvoiceTest{
   
   public static void main(String[] args){
      
      Scanner input = new Scanner(System,in);
      String num;
      String desc;
      int qty;
      float prix;
      
      Invoice test = new Invoice();
      
      System.out.print("\nBefore initialisation\n");
      System.out.printf("%n%s: %s%n%s: %s%n%s: %d%n%s: %.2f%n","Number", test.getNumber(), "Description", getDescription(), "Quantity", getQuantity(), "Unit Price", getUnitPrice());
      
      System.out.print("Enter Item nmuber: ");
      num = input.nextLine();
      test.setNumber(num);
      
      System.out.print("Enter Item Description: ");
      desc = input.nextLine();
      test.setDescription(desc);
      
      System.out.print("Enter Item quantity: ");
      qty = input.nextInt();
      test.setQuantity();
      
      System.out.print("Enter Item's Unit price: ");
      prix = input.nextFloat();
      test.setUnitPrice(prix);
      
      System.out.print("\nBefore initialisation\n");
      System.out.printf("%n%s: %s%n%s: %s%n%s: %d%n%s: %.2f%n%s: %.2f","Number", test.getNumber(), "Description", getDescription(), "Quantity", getQuantity(), "Unit Price", getUnitPrice(), "Total invoice", getInvoiceAmount);
      
   }
   
}
