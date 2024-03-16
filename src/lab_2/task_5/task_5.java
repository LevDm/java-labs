package lab_2.task_5;

public class task_5 {
    public static void main (String[] args) {
        Rectangle rectangle = new Rectangle(10.0f, 20.0f);

        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        rectangle.setLength(30.0f);
        rectangle.setWidth(40.0f);
        System.out.println("Длина: " + rectangle.getLength());
        System.out.println("Ширина: " + rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
    }
}
