class ArithmeticSmallestLargest{
   
   public int getMin(int a, int b, int  c, int d, int e){
     int min = a;
     if(b < min)
       min = b;
     if(c < min)
       min = c;
     if(d < min)
       min = d;
     if(e < min)
       min = e;
     return min;
   }
   
   public int getMax(int a, int b, int  c, int d, int e){
     int max = a;
     if(b > max)
       max = b;
     if(c > max)
       max = c;
     if(d > max)
       max = d;
     if(e > max)
       max = e;
     return max
   }
   
}
