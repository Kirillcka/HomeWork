package HomeWork7;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 15),
                      new Cat("Bob", 30),
                      new Cat("Kisun", 30),
                      new Cat("Vaska", 35)};

        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println("\n" + plate);
        plate.increaseFood(0);
        System.out.println(plate);
        System.out.println("Cats take food:");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}
