package lab_2.task_9;

public class Square extends SquareShape {
    public Square(double a) {
        super(a, a);
    }

    public double getArea () {
        return this.a * this.a;
    }
}
