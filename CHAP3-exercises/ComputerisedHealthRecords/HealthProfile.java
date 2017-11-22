public class HealthProfile{
   
   private String FirstName;
   private String LastName;
   private String gender;
   private float heigth;
   private float weight;
   private int day;
   private int month;
   private int year;
   
   public HeartRates(){
     this.day = 1;
     this.month = 1;
     this.year = 1970;
     this.weight = 0.0;
     this.height = 0.0;
     this.gender = "fe/male"
     this.FirstName = "First"
     this.LastName = "Last Name"
   }
   
   public void setDay(int day){
   if(day > 0 && day < 32){
        this.day = day;
       }
   }
   
   public void setMonth(int month){
   if(month > 0 && month < 13){
     this.month = month;
     }
   }
   
   public void setYear(){
     if(year >= 0){
       this.year = year;
     }
   }
   
   public int getDay(){
     return day;
   } 
   
   public int getMonth(){
     return month;
   } 
   
   public int getYear(){
     return year;
   } 
   public float getHeight(){
     return height;
   }
   
   public float getWeigth(){
     return weight;
   }
     
   public void setFirstName(String FirstName){
     this.FirstName = FirstName;
   }
   public void setGender(String gender){
     this.gender = gender;
   }
   
   public void setLastName(String LastName){
     this.LastName = LastName;
   }

   public void getFirstName(){
     return FirstName;
   }
   
   public void getLastName(){
     return LastName;
   }
   
   public void getGender(){
     return gender;
   }
   
   
}
