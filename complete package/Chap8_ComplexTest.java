public class Chap8_ComplexTest {

    public static void main(String[] args){

        Chap8_Complex z1 = new Chap8_Complex(); // default 0 + 0i

        Chap8_Complex z2 = new Chap8_Complex(7,8); // 7 + 8i
        Chap8_Complex z3 = new Chap8_Complex(4,2); // 4 + 2i

        Chap8_Complex sum = new Chap8_Complex();
        sum = Chap8_Complex.addition(z2,z3);

        Chap8_Complex difference = new Chap8_Complex();
        difference = Chap8_Complex.subtraction(z2,z3);

        displayComplex(z1,"z1","Default parameter");
        displayComplex(z2,"z2","Initialised with values");
        displayComplex(z3,"z3","Initialised with values");
        displayComplex(sum, "sum", "Sum of z2 and z3");
        displayComplex(difference, "difference", "Difference between z2 and z3");

    }

    private static void displayComplex(Chap8_Complex z, String name, String t){
        System.out.printf("%n%s%n%s: %s + %si %nRepresented as ordered pair: %s(%s,%s)%n",t,name,z.getReal(),z.getImaginary(),name,z.getReal(),z.getImaginary());
    }

}
