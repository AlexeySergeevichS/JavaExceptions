package Seminar1;

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Размерность массива: %d\n", task(new int[]{5, -5, 6}));

    }

    static int task(int[] arr) {
        if (arr == null) {
            return -2;
        }
        if (arr.length == 0) {
            return -1;
        }
        return arr.length;
    }
}
