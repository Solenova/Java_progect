package Exception0512;

public class Task1 {
    private final static int MIN_LENGTH = 5;
    // Реализуцте метод, принимающй в качестве аргумента целочисленный массив.
    // Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    // в качестве кода рошибки, иначе - длину массива.

    public static void main(String[] args) {
        System.out.println(getSize(new int[] { 1, 2 }));
        System.out.println(getSize(new int[] { 1, 2, 3, 4, 5, 6 }));

    }

    public static int getSize(int[] array) {
        if (array.length < MIN_LENGTH) {
            return -1;
        }

        return array.length;

    }
}
