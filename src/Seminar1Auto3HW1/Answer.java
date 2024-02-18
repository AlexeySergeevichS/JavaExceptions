package Seminar1Auto3HW1;

public class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int c[];
        if (a==null||b==null||a.length != b.length){
            c = new int[]{0};
            return c;
        }
        c = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            if (b[i] == 0) throw new RuntimeException("Деление на 0!");
            else c[i] = a[i] / b[i];
        }
        return c;

    }
}
