package lab_2.task_8;

public class task_8 {
    public static void main(String[] args) {

        System.out.println("Собака:");
        Dog dog = new Dog("Барон", 8, "Зенне", 58,"гав" );
        System.out.println("-имя: " + dog.getName());
        System.out.println("-парода: " + dog.getBreed());
        System.out.println("-возраст: " + dog.getAge());
        System.out.println("-масса: " + dog.getMass());
        dog.makesSound();

        System.out.println("Кошка:");
        Cat cat = new Cat("Гарфилд", 6, "американская", "лазанья", "мяу");
        System.out.println("-имя: " + cat.getName());
        System.out.println("-парода: " + cat.getBreed());
        System.out.println("-возраст: " + cat.getAge());
        System.out.println("-еда: " + cat.getFoodType());
        cat.makesSound();
    }
}
