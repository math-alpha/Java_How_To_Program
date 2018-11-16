class ArithmeticSmallestLargest{
   
   public int getMin(int a, int b, int  c){
     int min = a;
     if(b < min)
       min = b;
     if(c < min)
       min = c;
       
     return min;
   }
   
   public int getMax(int a, int b, int  c){
     int max = a;
     if(b > max)
       max = b;
     if(c > max)
       max = c;
       
     return max;
   }
   
}
