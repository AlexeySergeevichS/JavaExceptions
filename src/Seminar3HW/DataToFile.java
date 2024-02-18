package Seminar3HW;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final public class DataToFile {
    /**
     * Создает файл, если его нет и записывает даннык, или дописывает данные в существующий файл
     *
     * @param data массив для записи в файл
     * @throws MyIOException Ошибка ввода вывода
     */

    private static void fileCreate(String[] data) throws MyIOException {
        boolean append = Files.exists(Path.of(data[0]));
        try (FileWriter fileWriter = new FileWriter(data[0], append);) {
            StringBuilder dataToWrite = new StringBuilder();
            for (String element : data) dataToWrite.append("<").append(element).append("> ");
            if (append) fileWriter.write("\n");
            fileWriter.write(dataToWrite.toString().trim());
        } catch (IOException e) {
            throw new MyIOException(e.getMessage(), data[0]);
        }

    }

    /**
     * Записывает массив из 6 параметров в файл
     *
     * @param data массив данных для записи в файл
     * @throws DateDataException        Ошибка даты рождения
     * @throws PhoneNumberDataException Ошибка номера телефона
     * @throws NullDataException        Ошибка пустого массива
     * @throws CountDataException       Ошибка количества элементов передаваемого массива
     * @throws FIODataException         Ошибка фамилии, имени, отчества
     * @throws GenderDataException      Ошибка пола
     * @throws IOException              Ошибка работы с файлом
     */
    public static void run(String[] data) throws DateDataException, PhoneNumberDataException, NullDataException, CountDataException, FIODataException, GenderDataException, IOException {
        if (data == null) {
            throw new NullDataException("Нет ссылки на массив");
        }
        if (data.length != 6) {
            throw new CountDataException("Некорректное количество данных", data.length);
        }
        for (int i = 0; i < 3; i++) {
            if (data[i].length() < 3) {
                throw new FIODataException("Некорректное ФИО", i, data[i]);
            }
        }
        if (!data[5].equalsIgnoreCase("m") && !data[5].equalsIgnoreCase("f")) {
            throw new GenderDataException("Некорректное значение пола", data[5]);
        }
        if (isNotPhoneNumber(data[4])) {
            throw new PhoneNumberDataException("Некорректный номер телефона", data[4]);
        }
        if (isNotBDate(data[3])) {
            throw new DateDataException("Некорректная дата", data[3]);
        }
        fileCreate(data);
    }

    /**
     * Проверка номера телефона
     *
     * @param s проверяемая строка
     * @return true если номер телефона некорректен
     */
    private static boolean isNotPhoneNumber(String s) {
        try {
            for (int i = 1; i < s.length(); i++) {
                Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        } catch (NumberFormatException e) {
            return true;
        }
        if (s.charAt(0) != '+' || s.length() != 12) return true;
        return false;
    }

    /**
     * Проверка формата и корректности даты рождения
     *
     * @param s строка для проверки
     * @return true если дата некорректна
     */
    private static boolean isNotBDate(String s) {

        String[] sDate = s.split("\\.");

        if (sDate.length != 3) return true;
        if (sDate[0].length() != 2 || sDate[1].length() != 2 || sDate[2].length() != 4) return true;
        try {
            int dd = Integer.parseInt(sDate[0]);
            int mm = Integer.parseInt(sDate[0]);
            int yyyy = Integer.parseInt(sDate[0]);
            if (dd < 1 || dd > 32 || mm < 1 || mm > 12) return true;
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }
}