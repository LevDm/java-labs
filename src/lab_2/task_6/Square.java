package lab_2.task_6;

public class Square implements Shape {
    private double size;
    public Square(double side) {
        this.size = size;
    }
    @Override
    public double getArea() {
        return Math.pow(this.size, 2);
    }
    @Override
    public double getPerimeter() {
        return 4 * this.size;
    }
}
