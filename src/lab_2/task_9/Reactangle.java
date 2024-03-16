package lab_2.task_9;

public class Reactangle extends SquareShape{
    public Reactangle(double a, double b) {
        super(a, b);
    }

    public double getArea () {
        return this.a * this.b;
    }
}
