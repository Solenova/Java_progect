import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Deque;

public class Homework4_0 {
    public static void main(String[] args) {
        String[] arr = { "mama", "mila", "ramu", "rama", "clear" };
        List<String> list = new LinkedList<>();
        // List <String> list=stackArr(arr);
        
        // queueArr(arr);
        // invertedList(queueArr(arr));
        System.out.println(stackArr(arr));
        invertedList(stackArr(arr));
    }

    // 0.1) Написать метод, который принимает массив элементов, помещает их в стэк
    // и выводит на консоль содержимое стэка.
    public static List<String> stackArr(String[] arr) {
        LinkedList<String> stack = new LinkedList<>();
        for (String i : arr)
            stack.addFirst(i);
        // System.out.println(stack);

        return stack;

    }

    // 0.2) Написать метод, который принимает массив элементов, помещает их в
    // очередь
    // и выводит на консоль содержимое очереди.
    public static void queueArr(String[] arr) {
        Queue<String> queue = new LinkedList<>();
        for (String i : arr)
            queue.add(i);
        System.out.println(queue);
    }

    // 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.
    public static void invertedList(List<String> list) {
        LinkedList<String> invertL = new LinkedList<>();
        for (String i : list) {
            invertL.addFirst(i);
        }
            System.out.println(invertL);
     }

     


    }
