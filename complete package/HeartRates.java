public class HeartRates{
   
   private String FirstName;
   private String LastName;
   private int day;
   private int month;
   private int year;
   
   public HeartRates(){
     this.day = 1;
     this.month = 1;
     this.year = 1970;
     this.FirstName = "First";
     this.LastName = "Last Name";
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
     
   public void setFirstName(String FirstName){
     this.FirstName = FirstName;
   }
   
   public void setLastName(String LastName){
     this.LastName = LastName;
   }

   public String getFirstName(){
     return FirstName;
   }
   
   public String getLastName(){
     return LastName;
   }
  //to be continued  
   
}
