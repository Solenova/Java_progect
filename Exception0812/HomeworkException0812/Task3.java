package Exception0812.HomeworkException0812;

import java.io.FileNotFoundException;

public class Task3 {

    // Дан следующий код, исправьте его там, где требуется (задание 3)

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };                   //если ввели массив, значит он уже не null
            abc[3] = 9;
        
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
