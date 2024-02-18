package Seminar3;

public class Task2 {
    /**
     * Создайте класс Счетчик, у которого есть метод add(), увеличивающий
     * значение внутренней int переменнойна 1.Сделайте так, чтобы с объектом
     * такого типа можно было работать в блоке try-with-resources. Нужно бросить
     * исключение, если работа с объектом типа счетчик была не в ресурсном try
     * и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
     * лучше всего.
     */
    public static void main(String[] args) {
        try (Counter counter = new Counter(1000)) {
            counter.add();
            counter.add();
            System.out.printf("Текущее значение счетчика: %d\n", counter.getCounter());
        } catch (CloseCounterException e) {
            System.out.println(e.getMessage());
        }
//catch (Exception e){
//
//}
    }
}
