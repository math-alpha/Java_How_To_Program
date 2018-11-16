public class Date{
   
   private int day;
   private int month;
   private int year;
   
   public Date(){
     this.day = 1;
     this.month = 1;
     this.year = 1970;
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
   
   public void setYear(int year){
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
   
}
