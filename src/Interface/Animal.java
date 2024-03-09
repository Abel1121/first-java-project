package Interface;

public interface Animal {
    void talk();
    String getType();
    SizeType getSize();
    int getNumberOfLegs();

    default void sleep() {
        System.out.println("Sleeeping");
    }

    default void wakeUp() {
        System.out.println("Woke UP!");
    }

    static void log() { // you cant override static void like static variable
        System.out.println("This is an animal interface!");
    }
}
