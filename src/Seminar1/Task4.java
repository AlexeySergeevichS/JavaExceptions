package Seminar1;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        task();
    }

    static Random rnd = new Random();

    static void task() {
        for (int i = 0; i < 5; i++) {
            int errorCode = processArray( generateArray());
            switch (errorCode){
                case -1 -> System.out.println("Некорректный размер массива.");
                case -2 -> System.out.println("Некорректное значение элемента массива.");
                default -> {
                    System.out.printf("Сумма элементов %d\n",errorCode);
                }
            }

        }

    }

    static int[][] generateArray() {
        int[][] arr = new int[rnd.nextInt(4, 6)][5];//50%
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rnd.nextInt(2);
            }
        }
        if (rnd.nextInt(3) == 0) {//33%
            arr[rnd.nextInt(arr.length)][rnd.nextInt(arr[0].length)] = 2;

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%d",arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    static int processArray(int[][] arr) {
        if (arr.length != arr[0].length) {
//            throw new RuntimeException(String.format("Некорректная размерность массива,\nожидали квадратный массив, получили %dx%d",
//                    arr.length, arr[0].length));
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
//                    throw new RuntimeException(String.format("Некорректная значение элемента по индексу [%d][%d]",
//                            i, j));
                    return -2;
                } else {
                    sum += arr[i][j];
                }
            }

        }
        return sum;
//        System.out.printf("Сумма элементов %d\n",sum);

    }
//89642763042 баумана 216\3 47 да 2шт 1000р
}
