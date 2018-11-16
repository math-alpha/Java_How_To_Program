import java.util.Scanner;

public class Chap8_RectangleClassTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Chap8_RectangleClass rect = new Chap8_RectangleClass();
        Chap8_RectangleClass rect1 = new Chap8_RectangleClass(2,6);

        System.out.print("\nFor rectangle 1 with (length = "+rect.getLength()+"m, width ="+rect.getWidth()+"m)");
        rect.area();
        rect.perimeter();
        System.out.print("\n\nFor rectangle 2 with (length = "+rect1.getLength()+"m, width ="+rect1.getWidth()+"m)");
        rect1.area();
        rect1.perimeter();

    }
}
