package Interface;

public interface Mammal {

    default void sleep() {
        System.out.println("Mammal sleeeping");
    }

    default void wakeUp() {
        System.out.println("Mammal woke UP!");
    }
}
