public class Employee{
   
   private String FirstName;
   private String LastName;
   private double Salary;
   
   public Employee(){
     this.FirstName = "First"
     this.LastName = "Last Name"
     this.Salary = 0.0;
   }
   
   public void setFirstName(String FirstName){
     this.FirstName = FirstName;
   }
   
   public void setLastName(String LastName){
     this.LastName = LastName;
   }
   
   public setSalary(float Salary){
     if(Salary > 0.0){
        this.Salary = Salary;
     }
   }
   
   public void getFirstName(){
     return FirstName;
   }
   
   public void getLastName(){
     return LastName;
   }
   
   public getSalary(){
     return Salary;
   }
   
}
