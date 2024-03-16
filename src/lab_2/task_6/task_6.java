package lab_2.task_6;

public class task_6 {
    public static void main (String[] args) {
        Shape circle = new Circle(1);
        System.out.println("Круг:");
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        Shape square = new Square(2);
        System.out.println("Квадрат:");
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        Shape triangle = new Triangle(3, 3, 3);
        System.out.println("Треугольник:");
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
    }
}
