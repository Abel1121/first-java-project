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
}
