package Exception0512.HomeworkException0512;

public class HomeTask2 {
    public static void main(String[] args) {
       
        String[][] arr = { { "12","45"}, { "55", "ok" } };
        System.out.println(sum2d(arr));

    }

    public static int sum2d(String[][] arr) {
        if (arr == null) { // проверка на null, проверяем есть ли такой массив
            throw new RuntimeException("Массив должен быть null");
        }
        if (arr[0].length < 5) { // проверка на null, проверяем есть ли такой массив
            throw new RuntimeException("Массив должен содержать не менее 5 столбцов");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (!arr[i][j].matches("\\d+")) {
                    // System.out.println("Некорректный ввод:"+input);
                    throw new RuntimeException(
                            "Некорректный ввод в строке" + i + "столбце " + j + " элемента:" + arr[i][j]);
                } else {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }

            }
        }
        return sum;
    }
}
