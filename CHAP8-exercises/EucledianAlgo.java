public class EucledianAlgo {

    public static int euclid(int a, int b){  // a should be greater
        int vals, temp = 1;
        boolean test1, test2;
        test1 = isPrime(a);
        test2 = isPrime(b);
        if (test1 && test2)
            return -1;
        else if(commonFactor(a,b)){
            while (b != 0){
                temp = a;
                a = a / b;
                b = temp % b;
            }
        }
        System.out.println("Euclidean algo completed and returned value is "+temp);
        vals = temp;
        return vals; // returns -1 if there is no possible decomposition.
    }

    private static boolean isPrime(int k){
        boolean condition = true;
        for (int i = 1; i < k; i++) {
            if(k % i == 0){
                condition = false;
                break;
            }
        }
        return condition;
    }

    private static boolean commonFactor(int a, int b){
        boolean cond = false;
        for (int i = 1; i < ((a > b) ? a : b); i++) {
            if (a % i == 0 && b % i == 0)
                cond = true;
        }
        return cond;
    }

    public static int gcd(int a, int b){ // a greater
        int gcd  = 1;
        if (a > b)
            for (int i = 1; i < a; i++) {
                if ((a % i == 0) && (b % i == 0)){
                    gcd = i;
                }
            }
        else
            for (int i = 1; i < b; i++) {
                if ((a % i == 0) && (b % i == 0)){
                    gcd = i;
                }
            }
        return gcd;
    }
}