package Interface;

public class Dog implements Animal, Mammal {
    @Override
    public void talk() {
        System.out.println("Szczek szczek");
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void wakeUp() {
        System.out.println("Dog is wake UP!");
    }
}
