package Exception0512.HomeworkException0512;

public class HomeTask1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    private final static int MIN_LENGTH = 5;

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5 };
        int[] arr = { 1, 2 };
        System.out.println(checkingForNull(array));
        System.out.println(getSize(array));
        System.out.println(checkingForNull(arr));
        System.out.println(numberOfEqualElements(array, arr));

    }

    public static int getSize(int[] array) {
        // проверка размерности массива по условию. Исключаем случай, когда размерность
        // меньше заданной константы.
        if (array.length < MIN_LENGTH) {
            throw new RuntimeException("Массив не может быть меньше " + MIN_LENGTH);
        }

        return array.length;
    }

    private static int checkingForNull(int[] array) {
        // проверка на null, проверяем есть ли такой массив
        if (array == null) {
            throw new RuntimeException("Массив не может быть null");

        }

        return 1;
    }

    private static int numberOfEqualElements(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Массивы должны быть равны");

        }

        int count = 0;
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        return count;
    }
}
