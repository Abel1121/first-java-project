package Interface;

public class Cat implements Animal, Mammal {
    @Override
    public void talk() {

    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }
}
