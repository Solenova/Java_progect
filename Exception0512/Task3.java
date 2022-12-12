package Exception0512;

public class Task3 {
    // Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный
    // массив.
    // Необходимо посчитать и вернуть сумму элементов этого массива. При этом
    // накладываем на метод 2 ограничения:
    // метод может работать только с квадратными массивами (кол-во строк = кол-ву
    // столбцов), и в каждой ячейке может лежать только значение 0 или 1.
    // Если нарушается одно из условий, метод должен бросить RuntimeException с
    // сообщением об ошибке.
    public static void main(String[] args) {
        int [] [] nums={{1,0},{0,2}};
        System.out.println(summElements(nums));
        
    }

    private static int summElements(int[][] array) {
        if (array == null) { // проверка на null, проверяем есть ли такой массив
            throw new RuntimeException("Массив не может быть null");

        }
        if (array.length != array[0].length) { // проверка равности количества строк и столбцов в массиве
            throw new RuntimeException("Массив должен быть квадратным");

        }
        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1 && array[i][j] != 0) {
                    throw new RuntimeException("Массив должен содержать значения 0 или 1");
                }
                summ += array[i][j];
            }

        }
        return summ;

    }

}
