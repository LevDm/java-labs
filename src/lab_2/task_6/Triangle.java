package lab_2.task_6;

public class Triangle implements Shape {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double s = (this.a + this.b + this.c) / 2;
        return Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
    }
    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}

