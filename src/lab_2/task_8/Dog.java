package lab_2.task_8;

public class Dog extends Animal {
    private String breed;
    private int mass;

    public Dog(String name, int age, String breed, int mass, String sound) {
        super(name, age, sound);
        this.breed = breed;
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void makesSound() {
        super.makesSound();
    }
}
