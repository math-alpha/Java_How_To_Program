class GreatestCommonDivisor{
 
    public int gcd(int a, int b){
       int r = 0, x, y;
       x = (a > b)? a : b;
       y = (a < b)? a : b;
       r = b;
       
       while(a % b != 0){
          r = a % b;
          a = b;
          b = r; 
       }
       return r;
    }
   
}
