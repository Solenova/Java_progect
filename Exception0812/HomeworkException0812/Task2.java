package Exception0812.HomeworkException0812;

//Если необходимо, исправьте данный код (задание 2)
public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3,58,2,4,6,5,4 };
        int d = 0;
        
        // считаю целесообразным использование try catch, т.к. выкидываются исключения
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("operation divide be zero not supported " );
        }
    }
}
