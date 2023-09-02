package HomeWork002;

import java.util.Scanner;

public class Task001 {

    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        System.out.println(process());

    }
    private static float process(){
        boolean getData = true;
        while (getData){
            try {
                return getData();
            } catch (NumberFormatException e){
                System.out.println("Вы ввели неверные данные, повторите ввод.");
            }
        }
        return 0;
    }
    private static float getData() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        return Float.parseFloat(scanner.nextLine());
    }


}
