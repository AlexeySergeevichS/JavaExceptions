package Seminar2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n*** Итерация #%d ***\n",i);
            processArray();
        }
    }
    private static void processArray(){
        try {
            System.out.printf("Сумма элементов массива: %d\n",processArrayInternal(generateArray()));
        } catch (MyArraySizeException e) {
            System.out.printf("%s, требовалось [4x4], получили [%dx%d]\n",e.getMessage(),e.getX(),e.getY());
        } catch (MyArrayDataException e) {
            System.out.printf("%s по индексу [%d][%d]\n",e.getMessage(),e.getX(),e.getY());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static Random rnd = new Random();

    private static String[][] generateArray() {
        int add = rnd.nextInt(2);
        String[][] arr = new String[4 + add][4 + add];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.toString(rnd.nextInt(-99, 100));
            }
        }
        if (rnd.nextInt(3) == 0) {
            arr[rnd.nextInt(arr.length)][rnd.nextInt(arr[0].length)] = "abc";
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%s\t", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    /**
     *
     * @param arr массив
     * @return сумма элементов
     * @throws NullPointerException Массив должен существовать
     * @throws MyArraySizeException Некорректная размерность массива
     * @throws MyArrayDataException Некорректный формат данных
     */
    private static int processArrayInternal(String[][] arr) throws MyArraySizeException, MyArrayDataException, NullPointerException{
        if (arr == null)
            throw new NullPointerException("Массив должен существовать");
        if (arr.length!=4||arr[0].length!=4)
            throw new MyArraySizeException("Некорректная размерность массива",arr.length,arr[0].length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum+=parseElement(arr[i][j],i,j);
            }
        }
        return sum;
    }

    /**
     *
     * @param s Значение элемента
     * @param x Индекс элемента
     * @param y Индекс элемента
     * @return результат преобразования значения элемента
     * @throws MyArrayDataException Некорректный формат данных
     */
    private static int parseElement(String s, int x,int y) throws MyArrayDataException{
        try {
            return Integer.parseInt(s);

        }
        catch (NumberFormatException e){
            throw new MyArrayDataException("Некорректный формат данных",x,y);
        }
    }
}
