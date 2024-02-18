package Seminar2AutoHW;

public class Expr {
    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже task2
        try {
            if (d == 0) {
                throw new ArithmeticException();
            }
            double res = (double) intArray[8] / d;
            System.out.printf("intArray[8] / d = %d / %d = %.1f\n", intArray[8], d, res);
            return res;
        } catch (ArithmeticException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        } catch (RuntimeException e) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }
    }

    public static double expr(int a, int b) {
        // Введите свое решение ниже task3
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return (double) a / b;
        } catch (ArithmeticException e) {

            return 0;
        } finally {
            printSum(a, b);
        }
    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже task3
        System.out.println(a + b);

    }

    public static String expr(char a) throws Exception {
// Введите свое решение ниже task4
        if (a == ' ') {
            throw new Exception("Empty string has been input.");
        }
        return String.format("Your input was - %s", a);
    }
}
