package Seminar3HW;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
                programRun();
    }
    /**
     * Вводим строку, пытаемся ее записать и обрабатываем ошибки
     */
        private static void programRun(){
            //Иванов Иван Михайлович 98.12.2000 +79508446123 m
            //Иванов Иван Михайлович 08.12.1998 +79508446123 m
            //Иванов Николай Олегович 12.12.2000 +79508446123 m
            //Иванов Ва Олегович 12.12.2000 +79508446е23 m
            //Иванов Николай Олегович 12.12.2000 +79508446123 g
            //Иванов Николай Олегович 12.12.2000 79508446123 m
            //Иванов Николай Олегович

            Scanner sc = new Scanner(System.in);
            System.out.print("Введи Фамилия Имя Отчество датаРождения номерТелефона пол\n-> ");
            String dataString = sc.nextLine();
            String[] data = dataString.split(" ");
            try {
                DataToFile.run(data);
                System.out.println("Данные сохранены!");
            } catch (CountDataException e) {
                System.out.printf("Введено неправильное количество данных, введено: %d, нужно 6.\n",e.getCount());
            } catch (FIODataException e) {
                System.out.printf("Вы ввели %s, длина должна быть больше двух символов.\n",e.getFio());
            } catch (GenderDataException e) {
                System.out.printf("Вы ввели некорректное значение пола: %s, нужно ввести f или m.\n",e.getGender());
            } catch (NullDataException e) {
                System.out.println(e.getMessage());
            } catch (PhoneNumberDataException e) {
                System.out.printf("Вы ввели некорректный номер телефона: %s, номер должен начинаться с + и состоять из 11 цифр.\n",e.getPhNumber());
            } catch (DateDataException e) {
                System.out.printf("Вы ввели некорректную дату рождения: %s, нужен формат dd.mm.yyyy",e.getbDate());
            } catch (MyIOException e) {
                System.out.println("Ошибка записи файла: " + e.getFileName());
            } catch (Exception e){
                System.out.println("Неожиданная ошибка: "+ e.getMessage());
            }

        }

    }
