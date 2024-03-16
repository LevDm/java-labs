package lab_2.task_4;

import java.util.Scanner;

public class task_4 {
    public static void main (String[] args) {
        Person myPerson = new Person("Лев", 22, "m");
        System.out.println("Класс Person:");
        System.out.println("-имя: "+myPerson.getName());
        System.out.println("-возраст: "+myPerson.getAge());
        System.out.println("-пол: "+myPerson.getGender());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Изменение значения полей:");

        System.out.println("-новое имя: ");
        String name = scanner.nextLine();

        System.out.println("-новый возраст: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("-новый пол: ");
        String gender = scanner.nextLine();

        //scanner.close();

        myPerson.setName(name);
        myPerson.setAge(age);
        myPerson.setGender(gender);

        System.out.println("Обновленый ласс Person:");
        System.out.println("-имя: "+myPerson.getName());
        System.out.println("-возраст: "+myPerson.getAge());
        System.out.println("-пол: "+myPerson.getGender());
    }
}
