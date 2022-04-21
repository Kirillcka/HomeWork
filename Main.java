package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Vaska", 200, 0);

        Animals dog  = new Dog("Sharik", 500, 10);

        System.out.println("Кот " + cat.getName() + " может пробежать " + cat.getSpeedLimit() + " метров и проплыть " + cat.getSwimLimit() + " метров");
        System.out.println("Кот " + cat.getName() + " пробежал " + cat.run(150) + " метров и проплыл " + cat.swim(0) + " метров");
        System.out.println("Собака " + dog.getName() + " может пробежать " + dog.getSpeedLimit() + " метров и проплыть " + dog.getSwimLimit() + " метров");
        System.out.println("Собака " + dog.getName() + " пробежал " + dog.run(450) + " метров и проплыл " + dog.swim(5) + " метров");
        System.out.println("Количество созданных котов: " + Cat.getCount());
        System.out.println("Количество созданных собак: " + Dog.getCount());
        System.out.println("Количество созданных животных: " + Animals.getCount());
    }
}
