package Seminar1Auto2HW1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        a = new int[]{4, 5, 6};
        b = new int[]{1, 2, 3};
        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
    }
}
