package HomeWork001;

import java.util.Scanner;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[4]);

    }

    public static void divisionByZero() {
        int res = 1/0;
        // Напишите свое решение ниже

    }

    public static void numberFormatException() {
        String str = "test";
        int number = Integer.parseInt(str);
        // Напишите свое решение ниже

    }
}

public class Task001 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}