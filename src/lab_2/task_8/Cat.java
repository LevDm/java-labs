package lab_2.task_8;

public class Cat extends Animal {
    private String breed, foodType;

    public Cat(String name, int age, String breed, String foodType, String sound) {
        super(name, age, sound);
        this.breed = breed;
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
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
