package lab_2.task_9;

public class SquareShape {
    protected double a, b;


    public SquareShape(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getHeight(){
        return this.a;
    }

    public double getWidth(){
        return this.b;
    }
    public double getPerimeter() {
        return (this.a + this.b)*2;
    }
}
