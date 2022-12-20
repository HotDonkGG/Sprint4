public abstract class Parallelogram implements Figure {

    public final double a;
    public final double b;
    private final double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.b = 0;
        this.h = h;
    }
}