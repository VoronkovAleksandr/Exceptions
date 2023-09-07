package HomeWork003;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

// Иванов Иван Иванович 01.01.2001 495123654 m

public class Main {
    public static void main(String[] args) {
        while (true) {
            String[] data = getData();
            int code = checkingDataForFull(data);
            if (processingDataForFull(code)) {
                try {
                    String surname = data[0];
                    String name = data[1];
                    String middleName = data[2];
                    LocalDate birthday = parseDate(data[3]);
                    int phone = Integer.parseInt(data[4]);
                    Gender gender = itIsMan(data[5]);
                    Human human = new Human(surname, name, middleName, birthday, phone, gender);
                    human.saveHuman();
                    System.out.println("Данные успешно записаны.");
                    if (!nextHuman()) break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Повторите ввод.");
                }
            }
        }
    }

    private static boolean nextHuman(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите продолжить ввод? (0 - Нет, 1 - Да)");
            String in = scanner.nextLine();
            switch (in){
                case "0" -> {
                    System.out.println("До свидания!");
                    return false;
                }
                case "1" -> {
                    return true;
                }
            }
            System.out.println("Ответ не распознан!");
        }
    }

    private static String[] getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел: " +
                "\nФамилия," +
                "\nИмя," +
                "\nОтчество," +
                "\nдата рождения(dd.mm.yyyy)," +
                "\nномер телефона (только цифры)," +
                "\nпол (f или m)");
        String data = scanner.nextLine();
        String[] dataArray =  data.split(" ");
        return dataArray;
    }

    private static int checkingDataForFull(String [] data){
        if (data.length < 6 ){
            return -1;
        } else if (data.length > 6 ) {
            return 1;
        }
        return 0;
    }

    private static boolean processingDataForFull(int code){
        switch (code){
            case -1 -> {
                System.out.println("Вы ввели мало данных");
                return false;
            }
            case 1 -> {
                System.out.println("Вы ввели много данных");
                return false;
            }
            case 0 -> {
                return true;
            }
        }
        System.out.println("Неверный код ошибки");
        return false;
    }

    private static LocalDate parseDate(String date) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate parsingDate = LocalDate.parse(date, formatter);
            return parsingDate;
        } catch (DateTimeParseException e){
            throw new Exception("Дата введена не верно");
        }
    }

    private static int parsePhone(String data) throws Exception{
        try{
            return Integer.parseInt(data);
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("Вы ввели неверные данные в поле для номера телефона");
        }
    }

    private static Gender itIsMan(String data) throws Exception {
        if (data.toLowerCase().equals("m")) {
            return Gender.Male;
        } else if (data.toLowerCase().equals("f")) {
            return Gender.Female;
        }
        throw new Exception("Вы неверно ввели пол.");
    }


}