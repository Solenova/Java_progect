import java.util.ArrayList;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<Integer> random = new ArrayList<Integer>();
        random = getRandom(10, 5);
        System.out.println(random);
        System.out.println(arithmeticMean(random));
        System.out.println(evenNumbers(random));
        
    }
    
    public static ArrayList<Integer> getRandom (int range, int size) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        int i=0;    
        while (i<size)   { 
            randomNumbers.add(new Random().nextInt(range)+1);
           i++;
            }
            return randomNumbers;
    }
// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа

public static ArrayList<Integer> evenNumbers (ArrayList<Integer> arr) {
    
    int i=arr.size()-1;    
    while (i>=0)   { 
        if(arr.get(i)%2==0){
            arr.remove(i);
        }
        i--;
        }
    return arr;
}

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public static double arithmeticMean (ArrayList<Integer> arr) {
    int summ=0;
    int i=0;    
    while (i<arr.size())   { 
        summ+=arr.get(i);
        i++;
        }
    double res=summ*1.0/arr.size();
    return res;
}

}

   
    

