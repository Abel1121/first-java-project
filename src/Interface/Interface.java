package Interface;

public class Interface {
    public static void interfaces() {
        Animal cat = new Cat();
        Animal bird = new Bird();

        System.out.println("CAT");
        cat.talk();
        System.out.println(cat.getNumberOfLegs());
        cat.sleep();
        cat.wakeUp();

        System.out.println("------------------");

        System.out.println("BIRD");
        bird.talk();
        System.out.println(bird.getNumberOfLegs());
        bird.sleep();
        bird.wakeUp();
    }
}
