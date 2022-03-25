/**
 * Java 1. HomeWork 2
 * 
 * @author Kirill Titov
 * @version 25.03.2022
 */
class HomeWork2 {

    public static void main(String[] args){
        System.out.println(within10and20(5, 10));
        isPositiveOrNegative(5);
        System.out.println(isNegativ(5));
        printWordNTimes("Доброго дня!", 3);
    }

    static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPositiveOrNegative(int a) {
        System.out.println(a >+ 0? "Положительное" : "Отрицательное");
    }

    static boolean isNegativ(int a) {
        return a <= 0;
    }

    static void printWordNTimes(String word, int n) {
        int i;
        for (i = 0; i < n; i++) {
        System.out.println(word);
        }
    }
}