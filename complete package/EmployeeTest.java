import java.util.Scanner;

public class EmployeeTest{
  
  public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
     Employee Account1 = new Employee();
     Employee Account2 = new Employee();
     
     System.out.print("Enter first employee's first name:");
     String Fname = input.nextLine();
     Account1.setFirstName(Fname);
     
     System.out.print("Enter first employee's last name:");
     String Lname = input.nextLine();
     Account1.setLastName(Lname);
     
     System.out.print("Enter first employee's monthly salary:");
     Double salary = input.nextDouble();
     Account1.setSalary(salary);
     
     
     System.out.print("Enter Second employee's first name:");
     Fname = input.nextLine();
     Account2.setFirstName(Fname);
     
     System.out.print("Enter second employee's last name:");
     Lname = input.nextLine();
     Account2.setLastName(Lname);
     
     System.out.print("Enter second employee's monthly salary:");
     salary = input.nextDouble();
     Account2.setSalary(salary);
     
    System.out.printf("%s: %s%n%s: %s%n%s: %.2f%n","Frist Name", Account1.getFirstName(), "Last Name", Account1.getLastName(), "Yearly Salary (without benefit)", Account1.getSalary()*12, "Benefit", .1*Account1.getSalary(),"Net Salary", (Account1.getSalary()*12)+(1*Account1.getSalary()));
     
  }
  
}