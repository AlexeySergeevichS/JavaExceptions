package Seminar1Auto2HW1;

public class Answer {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int c[];
        if (a.length != b.length){
            c = new int[]{0};
            return c;
        }
        c= new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            c[i] = a[i] - b[i];
        }
        return c;


    }
}
