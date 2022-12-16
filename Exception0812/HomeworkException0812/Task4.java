package Exception0812.HomeworkException0812;

import java.util.Scanner;

public class Task4 {
    // Разработайте программу, которая выбросит Exception,
    // когда пользователь вводит пустую строку. Пользователю должно
    // показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()||input.trim()=="") {
            throw new RuntimeException(" Пустые строки вводить нельзя");
        }
    }

}
