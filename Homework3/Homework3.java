package Homework3;
import java.util.ArrayList;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        randomArray = getRandom(10, 5);
        System.out.println(randomArray);
        System.out.println(arithmeticMean(randomArray));
        System.out.println(evenNumbers(randomArray));
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
public static MixedData arithmeticMean (ArrayList<Integer> arr) {
    int summ=0;
    int i=0;  
    int min=arr.get(0);
    int max=arr.get(0);  
    while (i<arr.size())   { 
        summ+=arr.get(i);
        if(arr.get(i)<min) min=arr.get(i);
        if(arr.get(i)>max) max=arr.get(i);
        i++;
        }
    double res=summ*1.0/arr.size();

    MixedData param= new MixedData(res, min, max);
    return param;
}

}

   
    

