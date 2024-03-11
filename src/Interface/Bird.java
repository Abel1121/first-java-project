package Interface;

public class Bird implements Animal {

    @Override
    public void talk() {

    }

    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }
}
