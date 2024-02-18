package Seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        prepareFile();
    }

    private static Random rnd = new Random();

    private static void prepareFile() {
//        FileWriter fileWriter = null;
        try (FileWriter fileWriter = new FileWriter("names.txt");){
//            fileWriter = new FileWriter("names.txt");
            fileWriter.write("Анна=3\n");
            fileWriter.write("Елена=5\n");
            fileWriter.write("Марина=6\n");
            if (rnd.nextInt(2) == 0) //50%
            {
                throw new Exception("Неожиданное исключение");
            }
            fileWriter.write("Владимир=?\n");
            fileWriter.write("Константин=?\n");
            fileWriter.write("Иван=4\n");
            fileWriter.flush();
//            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /*finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}

