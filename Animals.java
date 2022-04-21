package HomeWork6;

public abstract class Animals {
    private String name;
    private int speedLimit;
    private int swimLimit;
    static int count;

    public Animals(String name, int speedLimit, int swimLimit) {
        this.name = name;
        this.speedLimit = speedLimit;
        this.swimLimit = swimLimit;
        count++;
    }
    public static int getCount() {
        return count;
    }

    public boolean run(int speed) {
        return speed <= speedLimit;
    }

    public boolean swim(int distance) {
        return distance <= swimLimit;
    }

    public String getName() {
        return name;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }
}


