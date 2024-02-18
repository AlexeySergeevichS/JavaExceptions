package Seminar1;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            try {
                int[] arr = getSumArray(generateArrayV2(), generateArrayV2());
                for (int e : arr) {
                    System.out.printf("%d\t", e);
                }
                System.out.println();
            }
            catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
            catch(CustomArraySizeException e){
                System.out.println(e.getMessage());
                System.out.println("Размерность первого массива: "+e.getLength1());
                System.out.println("Размерность второго массива: "+e.getLength2());
            }
    }

    }
    static  int[] generateArrayV2() {
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(4, 6)];//50%
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-9, 10);
        }
        if (rnd.nextInt(3) == 0) {//33%
            arr = null;
        }
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%d ", arr[i]);

            }
            System.out.println();
        }
        return arr;
    }

    /**
     * Позволяет сложить поэлементно два массива
     *
     * @param array1  первый массив
     * @param array2 второй массив
     * @return результирующий массив
     * @throws NullPointerException      один из массивов проинициализирован некорректно
     * @throws CustomArraySizeException  оба массива должны иметь одинаковую размерность
     */
    static int[] getSumArray(int[] array1, int[] array2) throws NullPointerException, CustomArraySizeException {
        if (array1 == null || array2 == null) {
            throw new NullPointerException("Оба массива должны существовать.");
        }
        if (array1.length != array2.length) {
            throw new CustomArraySizeException("Кол-во элементов массивов должно быть одинаковым", array1.length, array2.length);
        }
        int[] res = new int[array1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = array1[i] + array2[i];
        }
        return res;
    }
}
