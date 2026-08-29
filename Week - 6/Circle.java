import mypack.Shape;

public class Circle {
    public static void main(String[] args) {
        Shape s = new Shape();

        double radius = 5;
        double result = s.area(radius);

        System.out.println("Radius = " + radius);
        System.out.println("Area of Circle = " + result);
    }
}