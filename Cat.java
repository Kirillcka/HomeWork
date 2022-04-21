package HomeWork6;

public class Cat extends Animals {
    private static int count;

    public Cat(String name, int speedLimit, int swimLimit) {
        super(name, speedLimit, swimLimit);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
