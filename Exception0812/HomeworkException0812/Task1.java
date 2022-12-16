package Exception0812.HomeworkException0812;

import java.util.Scanner;

public class Task1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить
    // к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных. В
    // этом задании
    // не используем try catch. Пишем регулярное выражение и используем на строке
    // метод matches.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(checkingTheNumber(input));

    }

    private static Float checkingTheNumber(String value) {
        if (!(value.matches("\\d+\\.\\d+"))) {
            throw new RuntimeException("Некорректный ввод:" + value);
           
        } else {
            Float num = Float.parseFloat(value);
            return num;
        }
        
    }
}
