public class Chap8_RationalTest {
    public static void main(String[] args){

        Chap8_Rational rational = new Chap8_Rational(6,9);
        Chap8_Rational rational1 = new Chap8_Rational(12,36);
        Chap8_Rational rational2 = new Chap8_Rational(27,6); // improper fraction

        Chap8_Rational.addFractions(rational,rational1);
        Chap8_Rational.subtractFractions(rational,rational1);
        Chap8_Rational.multiplyFractions(rational,rational1);
        Chap8_Rational.divideFractions(rational1,rational2);
        Chap8_Rational.returnDecimal(rational1);
        System.out.printf("%nToString method %s",rational.toString());

    }
}
// TODO: 28 oct. 2018 complete chapter 8 exercises (4)