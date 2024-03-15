package Interface;

public class Interface {
    public static void interfaces() {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(dog.getNumberOfLegs());
        System.out.println(Dog.getDogsCount());
        System.out.println(Dog.getAllDogsLegs());
        Dog dog2 = new Dog();
        System.out.println(dog2.getNumberOfLegs());
        System.out.println(Dog.getDogsCount());
        System.out.println(Dog.getAllDogsLegs());
        Animal.log();
//        Animal[] animals = {cat, bird, dog};
//
//        for (Animal animal : animals) {
//            showAnimalInfo(animal);
//            System.out.println("------------------");
//        }
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
