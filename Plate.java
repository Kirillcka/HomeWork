package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "В тарелке осталось еды: " + food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }

    public int getFood() {
        return food;
    }

    public void increaseFood(int n) {
        food += n;
    }

}