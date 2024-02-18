package Seminar3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    /**
     * Задача 1
     * +++++
     * 1. Создатб класс исключения, кот буд выб при делении на 0. Сообщение об ошибке
     * 2. Пустой элемен7т в массиве ссылочного типа. Сооб
     * 3. Открыть несущ файл. Сооб
     * 4. Демонстрация
     */
    public static void main(String[] args) {
        try {
            test1();
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
        try {
            test2(new Integer[]{1,2,null,5},3);
            test2(new String[]{"AA","gg",null,"5"},2);

        }
        catch (NullElementArrayException e){
            System.out.println(e.getMessage());
            System.out.println("Индекс элемента: " + e.getIndex());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            test3("ky-ky");
        } catch (MyFileNotFoundException e) {
            System.out.printf("%s\nНаименование файла: %s\n",e.getMessage(),e.getFileName());
        }
    }

    static void test1() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException("Ошибка деления числа на 0");
        }
    }
    static <T> void test2(T[] array, int index){
        if (array[index] == null)
            throw new NullElementArrayException("Элемент массива не проинициализирован",index);
        System.out.printf("Значение элемента массива: %s\n",array[index]);
    }
    static void test3(String fileName) throws MyFileNotFoundException{
        try(FileReader fileReader = new FileReader(fileName)){

        }
        catch (FileNotFoundException e){
            throw new MyFileNotFoundException("Файл не найден.",fileName);
        }
        catch (Exception e){

        }

    }
}
