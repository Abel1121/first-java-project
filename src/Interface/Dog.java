package Interface;

public class Dog implements Animal, Mammal {
    public static final int DOG_LEGS = 4;

    private static int dogsCount;

    Dog() {
        dogsCount++;
    }

    public static int getAllDogsLegs() {
        return dogsCount * DOG_LEGS;
    }

    public static int getDogsCount() {
        return dogsCount;
    }
    @Override
    public void talk() {
        System.out.println("Szczek szczek");
    }

    @Override
    public String getType() {
        return "Dog";
    }
    @Override
    public SizeType getSize() {
        return SizeType.BIG;
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
