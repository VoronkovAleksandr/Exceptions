package HomeWork001;

import java.util.Arrays;

class AnswerT3 {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length != b.length){
            return new int[1];
        }
        int[] res = new int[a.length];
        try {
            for (int i = 0; i < a.length; i++) {
                res[i] = a[i] / b[i];
            }
        } catch (RuntimeException e){
            System.out.println("\nОшибка: " + e.getMessage());
            return new int[1];
        }
        return res;

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task003{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16, 25};
            b = new int[]{4, 2, 4, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        AnswerT3 ans = new AnswerT3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}