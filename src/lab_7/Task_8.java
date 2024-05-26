package lab_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Cat implements Serializable {
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
public class Task_8 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 5);
        String filename = "src/lab_7/cat.ser";
        try {
            serializeObject(cat, filename);
            Cat restoredCat = deserializeObject(filename);
            if (restoredCat != null) {
                System.out.println("Значения полей:");
                System.out.println("Name: " + restoredCat.getName());
                System.out.println("Age: " + restoredCat.getAge());
            }
            if (deleteFile(filename)) {
                System.out.println("Файл удален: " + filename);
            } else{
                System.out.println("Не удалось удалить файл: " + filename);
            }
        } catch(IOException | ClassNotFoundException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    private static void serializeObject (Cat cat, String filename) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(cat);
            System.out.println("Объект записан в файл: " + filename);
        }
    }
    private static Cat deserializeObject (String filename) throws IOException, ClassNotFoundException {
        Cat restoredCat;
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            restoredCat = (Cat) in.readObject();
            System.out.println("Объект восстановлен из файла: " + filename);
        }
        return restoredCat;
    }
    private static boolean deleteFile (String filename){
        File file = new File(filename);
        return file.delete();
    }
}