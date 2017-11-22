import java.util.Scanner;

public DateTest(){

  public static void main(String[] args){  

     Scanner input = new Scanner(System.in);
     Date test = new Date();
   
     System.out.printf("%s : %d/%d/%d %s%n","Initial date",test.getDay(),test.getMonth(), test.getYear, "in dd/mm/yy format");
   
     System.out.print("Enter day");
     String dd = input.nexLine();
     test.setDay(dd);
     
     System.out.print("Enter month");
     String mm = input.nexLine();
     test.setMonth(mm);
     
     System.out.print("Enter day");
     String dd = input.nexLine();
     test.setYear(yy);
   
     System.out.printf("%s : %d/%d/%d %s%n","Date from input",test.getDay(),test.getMonth(), test.getYear, "in dd/mm/yy format");
   
   }

}
