package Seminar1;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task();
    }

    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();

    static void task() {
        while (true) {
            System.out.print("Значение для поиска: ");
            int searchNumber = Integer.parseInt(sc.nextLine());
            int[] array = new int[rnd.nextInt(1, 6)];
            if (rnd.nextInt(3) == 0) // 33%
                array = null;
            if (array != null) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = rnd.nextInt(10);
                    System.out.printf("%d\t", array[i]);

                }
                System.out.println();
            }
            int codeResult = processArray(array, searchNumber);
            switch (codeResult) {
                case -1 -> System.out.println("Размерность < 3х симв");
                case -2 -> System.out.println("Элемент не найден");
                case -3 -> System.out.println("Массив некорректно проинициализирован");
                default -> {
                    System.out.println("Массив успешно обраб. завершение р п");
                    System.out.printf("Элемент найден по индексу %d\n", codeResult);
                    return;
                }
            }
        }

    }

    static int processArray(int[] array, int searchElement) {
        if (array == null) {
            return -3; //некоррекно проинициализирован
        }
        if (array.length < 3) {
            return -1; //длина меньше 3х
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i;
            }
        }
        return -2; //элемент не найден
    }
}
