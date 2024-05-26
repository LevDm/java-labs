package lab_7.Task_1_2;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Example_7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);
        try {
            FileOutputStream fileOut = new FileOutputStream("src/lab_7/Task_1_2/person.json");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}