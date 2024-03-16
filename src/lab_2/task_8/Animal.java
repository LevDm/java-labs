package lab_2.task_8;

public class Animal {
    private String name, sound;
    private int age;
    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void makesSound() {
        System.out.println("!!!" + this.sound);
    }
}
