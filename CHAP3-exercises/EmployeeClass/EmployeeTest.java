import java.util.Scanner;

public class EmployeeTes{
  
  public static void main(String[] args){
     
     Scanner input = new Scanner;
     Employee Account1 = new Employee();
     Employee Account2 = new Employee();
     
     System.out.print("Enter first employee's first name:");
     String Fname = input.nextLine();
     Account1.setFirstName(Fname);
     
     System.out.print("Enter first employee's last name:");
     String Lname = input.nextLine();
     Account1.setLastName(Lname);
     
     System.out.print("Enter first employee's monthly salary:");
     String salaire = input.nextFloat();
     Account1.setSalary(salaire);
     
     
     System.out.print("Enter Second employee's first name:");
     String Fname = input.nextLine();
     Account.setFirstName(Fname);
     
     System.out.print("Enter second employee's last name:");
     String Lname = input.nextLine();
     Account2.setLastName(Lname);
     
     System.out.print("Enter second employee's monthly salary:");
     String salaire = input.nextFloat();
     Account2.setSalary(salaire);
     
    System.out.printf("%s: %s%n%s: %s%n%s: %.2f%n","Frist Name", Account1.getFirstName(), "Last Name", Account1.getLastName(), "Yearly Salary (without benefit)", Account1.getSalary()*12, "Benefit", .1*Account1.getSalary(),"Net Salary", (Account1.getSalary()*12)+(1*Account1.getSalary())) 
     
  }
  
}
