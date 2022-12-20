public class Rectangle extends  Parallelogram{
    // Длины сторон прямоугольника


    public Rectangle(double a, double b) {
     super(a,b);
    }

    public double getArea() {
        return a * b;
    }
}