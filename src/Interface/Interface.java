package Interface;

public class Interface {
    public static void interfaces() {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();

        Animal[] animals = {cat, bird, dog};

        for (Animal animal : animals) {
            showAnimalInfo(animal);
            System.out.println("------------------");
        }
    }

    private static void showAnimalInfo(Animal animal) {
        System.out.println(animal.getType());
        animal.talk();
        System.out.println(animal.getNumberOfLegs());
        animal.sleep();
        animal.wakeUp();
        System.out.println(animal.getSize());
    }
}
