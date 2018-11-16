public class Employee{
   
   private String firstName;
   private String lastName;
   private double salary;
   
   public Employee(){
     this.firstName = "First";
     this.lastName = "Last Name";
     this.salary = 0.0;
   }
   
   public void setFirstName(String FirstName){
     this.firstName = FirstName;
   }
   
   public void setLastName(String LastName){
     this.lastName = LastName;
   }
   
   public void setSalary(Double salary){
     if(salary > 0.0){
        this.salary = salary;
     }
   }
   
   public String getFirstName(){
     return firstName;
   }
   
   public String getLastName(){
     return lastName;
   }
   
   public double getSalary(){
     return salary;
   }
   
}
