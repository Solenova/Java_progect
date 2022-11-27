// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.print("Введите строку");
        Scanner iScannerYear = new Scanner(System.in);
        String str = iScannerYear.nextLine();
        System.out.println(str);

        System.out.println(palindrome (str));
        System.out.println(palindromeReverseString(str)); 
    }

    public static boolean palindrome(String text) {
        String str = text.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();
        int initV = 0;
        int finalV = length - 1;
        while (finalV > initV) {
            char initVChar = str.charAt(initV++);
            char finalVChar = str.charAt(finalV--);
            if (initVChar != finalVChar)
                return false;
        }
        return true;
    }
    
    // 2 variant
    public static boolean palindromeReverseString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase(); //исключение пробелов из строки
        char[] plain = clean.toCharArray();                             //преобразование строки в массив
        for (int i = plain.length - 1; i >= 0; i--) {                   //в цикле замещение символов в строке reverse 
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);                  //сравнение строк reverse и clean
    }
}
