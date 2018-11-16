public class Chap8_Rational {

    private int numerator;
    private int denominator;

    Chap8_Rational(){
        this(1,1);
    }

    Chap8_Rational(int num, int denom){
        int factor = EucledianAlgo.gcd(num, denom);
        //System.out.println("Greatest common factor of "+num+" and "+denom+": "+ factor + "\nReduced fraction: "+num/factor+"/"+denom/factor+"\n");
        this.numerator = num/factor;
        this.denominator = denom/factor;
    }
    public static Chap8_Rational addFractions(Chap8_Rational x, Chap8_Rational y){
        Chap8_Rational z = new Chap8_Rational();
        z.numerator = (x.numerator * y.denominator) + (y.numerator * x.denominator);
        z.denominator = (x.denominator * y.denominator);
        int factor = EucledianAlgo.gcd(z.numerator,z.denominator);
        z.numerator /= factor;
        z.denominator /= factor;
        System.out.println("Sum of the fraction\n "+x.numerator+"/"+x.denominator+" + "+y.numerator+"/"+y.denominator+" = "+z.numerator+"/"+z.denominator);
        return z;
    }

    public static Chap8_Rational subtractFractions(Chap8_Rational x, Chap8_Rational y){
        Chap8_Rational z = new Chap8_Rational();
        z.numerator = (x.numerator * y.denominator) - (y.numerator * x.denominator);
        z.denominator = (x.denominator * y.denominator);
        int factor = EucledianAlgo.gcd(z.numerator,z.denominator);
        z.numerator /= factor;
        z.denominator /= factor;
        System.out.println("Difference of the fraction\n "+x.numerator+"/"+x.denominator+" - "+y.numerator+"/"+y.denominator+" = "+z.numerator+"/"+z.denominator);
        return z;
    };

    public static Chap8_Rational multiplyFractions(Chap8_Rational x, Chap8_Rational y){
        Chap8_Rational z = new Chap8_Rational();
        z.numerator = (x.numerator * y.numerator);
        z.denominator = (x.denominator * y.denominator);
        int factor = EucledianAlgo.gcd(z.numerator,z.denominator);
        z.numerator /= factor;
        z.denominator /= factor;
        System.out.println("Product of the fraction\n "+x.numerator+"/"+x.denominator+" * "+y.numerator+"/"+y.denominator+" = "+z.numerator+"/"+z.denominator);
        return z;
    };

    public static Chap8_Rational divideFractions(Chap8_Rational x, Chap8_Rational y){
        Chap8_Rational z = new Chap8_Rational();
        z.numerator = (x.numerator * y.denominator);
        z.denominator = (x.denominator * y.numerator);
        int factor = EucledianAlgo.gcd(z.numerator,z.denominator);
        z.numerator /= factor;
        z.denominator /= factor;
        System.out.println("Product of the fraction\n "+x.numerator+"/"+x.denominator+" / "+y.numerator+"/"+y.denominator+" = "+z.numerator+"/"+z.denominator);
        return z;
    };

    public static void returnDecimal(Chap8_Rational z){
        float t = z.numerator, t1 = z.denominator;
        System.out.printf("%.4f",t/t1);
    }

    @Override
    public String toString(){
        return String.format("%n%d/%d%n",this.numerator,this.denominator);
    }

}
