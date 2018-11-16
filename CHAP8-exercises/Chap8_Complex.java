public class Chap8_Complex {

    private double real;
    private double imaginary;

    public Chap8_Complex(){
        this(0.0,0.0);
    }

    public Chap8_Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public static Chap8_Complex addition(Chap8_Complex z1, Chap8_Complex z2 ){

        Chap8_Complex z = new Chap8_Complex();
        z.real = z1.real + z2.real;
        z.imaginary = z1.imaginary + z2.imaginary;

        return z;

    }

    public static Chap8_Complex subtraction(Chap8_Complex z1, Chap8_Complex z2 ){

        Chap8_Complex z = new Chap8_Complex();
        z.real = z1.real - z2.real;
        z.imaginary = z1.imaginary - z2.imaginary;

        return z;

    }

}
