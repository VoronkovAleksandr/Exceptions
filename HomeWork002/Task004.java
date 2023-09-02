package HomeWork002;

import java.util.Scanner;

public class Task004 {
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        System.out.println(process());

    }
    private static String process(){
        boolean getData = true;
        while (getData){
            try {
                return getData();
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        return "";
    }
    private static String getData() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        String data = scanner.nextLine();
        if (data == "")
            throw new RuntimeException("Вы ввели пустую строку. Ввод пустой строки недопустим!");
        return data;
    }


}
