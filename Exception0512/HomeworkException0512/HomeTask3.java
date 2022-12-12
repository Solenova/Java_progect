package Exception0512.HomeworkException0512;

import java.util.Arrays;

public class HomeTask3 {
    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива,
    // и возвращающий новый массив, каждый элемент которого равен разности
    // элементов двух входящих массивов в той же ячейке. Если длины массивов не
    // равны,
    // необходимо как-то оповестить пользователя. Вместо массива может прийти null
    // (обработать)
    public static void main(String[] args) {
        int[] array = {1, 2};
        int[] number = {3, 4};
        System.out.println(Arrays.toString(difference(array, number)));

    }

    private static int[] difference(int[] array, int[] number) {
        if (array == null || number == null) {
            throw new RuntimeException("Массивы не могут быть null");
        }
        if (array.length != number.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] difference = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            difference[i] = array[i] - number[i];
        }
        return difference;
    }

}
