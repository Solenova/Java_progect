package NumberСonverter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class ConvereterToArab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(romenToarab(str));
    }

    public static int romenToarab(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int arab;
        int end = str.length() - 1;
        char[] arr = str.toCharArray();
        int result = map.get(arr[end]);
        for (int i = end - 1; i >= 0; i--) {
            arab = map.get(arr[i]);
            if (arab < map.get(arr[i + 1])) {
                result -= arab;
            } else {
                result += arab;
            }
        }
        return result;
    }
}
