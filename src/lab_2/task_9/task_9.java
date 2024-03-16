package lab_2.task_9;

import lab_2.task_6.Shape;

public class task_9 {
    public static void main (String[] args) {

        Square square = new Square(2);
        System.out.println("Квадрат:");
        System.out.println("-Сторона: " + square.getHeight());
        System.out.println("-Площадь: " + square.getArea());
        System.out.println("-Периметр: " + square.getPerimeter());

        Reactangle reactangle = new Reactangle(3, 4);
        System.out.println("Прямоугольник:");
        System.out.println("-Высота: " + reactangle.getHeight());
        System.out.println("-Ширина: " + reactangle.getWidth());
        System.out.println("-Площадь: " + reactangle.getArea());
        System.out.println("-Периметр: " + reactangle.getPerimeter());
    }
}
