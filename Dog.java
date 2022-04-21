package HomeWork6;

public class Dog extends Animals {
    private static int count;

    public Dog(String name, int speedLimit, int swimLimit) {
        super(name, speedLimit, swimLimit);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
