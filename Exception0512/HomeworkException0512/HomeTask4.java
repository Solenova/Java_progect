package Exception0512.HomeworkException0512;

import java.util.Arrays;

public class HomeTask4 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
    // входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
    // оповестить пользователя. Важно: При выполнении метода единственное исключение, 
    // которое пользователь может увидеть - RuntimeException, т.е. ваше
    
    public static void main(String[] args) {
        int[] array = { 1, 2 };
        int[] number = { 1, 0 };
        System.out.println(Arrays.toString(quotient(array, number)));

    }

    private static double[] quotient(int[] array, int[] number) {
        if (array == null || number == null) {
            throw new RuntimeException("Массивы не могут быть null");
        }
        if (array.length != number.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        

        double[] quotient = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (number[i] == 0) {
                throw new RuntimeException("Деление на ноль 0 ");
            }

            quotient[i] = array[i] *1.0/ number[i];
        }
        return quotient;
    }
}
