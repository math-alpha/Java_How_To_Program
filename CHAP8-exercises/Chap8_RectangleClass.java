public class Chap8_RectangleClass {

    private double length;
    private double width;

    public Chap8_RectangleClass(){
        this(1.0,1.0);
    }

    public Chap8_RectangleClass(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) throws Exception {
        if(length >= 0.0 && length <= 20.0)
            this.length = length;
        else
            throw new Exception("Length not in range");
    }

    public void setWidth(double width) throws Exception {
        if(width >= 0.0 && width <= 20.0)
            this.width = width;
        else
            throw new Exception("width not in range");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void perimeter(){
        System.out.printf("%nPerimeter is : %.2f m.",2*(length+width));
    }

    public void area(){
        System.out.printf("%nArea is : %.2f m squared", length*width);
    }
}
