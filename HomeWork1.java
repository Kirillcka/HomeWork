class HomeWork1 {
    public static void main(String[] args){
            printThreeWords();
            checkSumSing();
            printColor();
            compareNumbers();
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSing(){
        int a = 3;
        int b = -5;
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor(){
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(){
        int a = 1;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}