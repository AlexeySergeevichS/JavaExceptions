package Seminar2AutoHW;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray;
        int d;
        intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        intArray = new int[]{0, 1, 2, };
        d = 0;
        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }
}
