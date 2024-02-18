package Seminar2AutoHW;

public class Task4 {
    public static void main(String[] args) {
        char a;
        a = 'J';
        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
