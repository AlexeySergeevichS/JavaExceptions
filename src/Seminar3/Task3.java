package Seminar3;

import java.util.Random;

public class Task3 {
    /**
     * Задача 3:
     * ++++++++
     * Спроектировать серию классов для работы с животным.
     * Защитить состояние и поведение класса используя исключения
     */

    public static void main(String[] args) {
        //Cat cat1 = new Cat("ABC");
        try {
            Cat cat1 = Cat.create("Персик");
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                int j = rnd.nextInt(2);
                try {
                    switch (j) {
                        case 0 -> cat1.swim(i * 10);
                        case 1 -> {
                            cat1.run(i * 10);
                            System.out.println("Кот успешно пробежал дистанцию.");
                        }
                    }
                } catch (AnimalRunException e) {
                    System.out.printf("Исключение при попытке %s пробежать %d метров.\n", e.getName(),e.getDistance());
                } catch (AnimalSwimException e) {
                    System.out.printf("Исключение при попытке %s проплыть %d метров.\n", e.getName(),e.getDistance());
                }
            }
        } catch (AnimalNameException e) {
            System.out.println(e.getName());
        }
    }
}
