package Exception0512;

import java.util.Scanner;

public class Task4 {
    //Обработка исключений на ввод из терминала
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();

        if (!input.matches("\\d+")){
            // System.out.println("Некорректный ввод:"+input);
            throw new RuntimeException("Некорректный ввод:"+input);
        } else {
            int num=Integer.parseInt(input);
            System.out.println(num+1);
        }
        
    }
division by zero
}
