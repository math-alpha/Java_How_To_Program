import java.util.Scanner;

class DateTest{

  public static void main(String[] args){

     Scanner input = new Scanner(System.in);
     Date test = new Date();
   
     System.out.printf("%s : %d/%d/%d %s%n","Initial date",test.getDay(),test.getMonth(), test.getYear(), "in dd/mm/yy format");
   
     System.out.print("Enter day");
     int dd = input.nextInt();
     test.setDay(dd);
     
     System.out.print("Enter month");
     int mm = input.nextInt();
     test.setMonth(mm);
     
     System.out.print("Enter year");
     int yy = input.nextInt();
     test.setYear(yy);
   
     System.out.printf("%s : %d/%d/%d %s%n","Date from input",test.getDay(),test.getMonth(), test.getYear(), "in dd/mm/yy format");
   
   }

}
