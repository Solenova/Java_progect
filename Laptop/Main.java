package Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.InputMap;

import Laptop.Laptop;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "* 1 - Бренд\n" +
                "* 2 - Диагональ\n" +
                "* 3 - ОЗУ \n" +
                "* 4 - Объем HHD \n" +
                "* 5 - Процессор\n");
        Map<Integer, String> map = new HashMap<>();
        map = inputMap();
        Scanner sc = new Scanner(System.in);
        Integer number = Integer.parseInt(sc.nextLine());

        // Создаем ноутбуки
        Laptop l1 = new Laptop();
        l1.company = "ASUS";
        l1.diagonal = "14";
        l1.ram = "4";
        l1.processor = "core2";
        l1.hd = "512";

        Laptop l2 = new Laptop();
        l2.company = "Lenovo";
        l2.diagonal = "15";
        l2.ram = "4";
        l2.processor = "Intel Core i5 3210M";
        l2.hd = "512";

        Laptop l3 = new Laptop();
        l3.company = "Samsung";
        l3.diagonal = "15";
        l3.ram = "8";
        l3.processor = "Intel Core i7 2670QM";
        l3.hd = "750";

        Laptop l4 = new Laptop();
        l4.company = "ASUS";
        l4.diagonal = "15";
        l4.ram = "8";
        l4.processor = "Intel Core i5 3210M";
        l4.hd = "1024";

        Laptop l5 = new Laptop();
        l5.company = "Lenovo";
        l5.diagonal = "15";
        l5.ram = "8";
        l5.processor = "Intel Core i5 3210M";
        l5.hd = "1024";

        Laptop l6 = new Laptop();
        l6.company = "Samsung";
        l6.diagonal = "15";
        l6.ram = "8";
        l6.processor = "Intel Core i7 2670QM";
        l6.hd = "1024";

        // Создаем список ноутбуков
        ArrayList<Laptop> laptop = new ArrayList<Laptop>();
        laptop.add(l1);
        laptop.add(l2);
        laptop.add(l3);
        laptop.add(l4);
        laptop.add(l5);
        laptop.add(l6);

        System.out.println(laptop);
        System.out.println();

        // System.out.println(filteredList(map, laptop, number));
        System.out.println(filteredList(laptop, number));
    }

    // Фильтрация по параметрам
    public static List<String> filteredList( ArrayList<Laptop> listLaptops, int num) {
        List<String> filtered = new ArrayList<>();
        
        switch (num) {
            case  (1):
                for (Laptop laptop : listLaptops) {
                    filtered.add(laptop.company);
                    }
                break;
            case (2):
            for (Laptop laptop : listLaptops) {
                  filtered.add(laptop.diagonal);
            }
                break;
            case (3):
            for (Laptop laptop : listLaptops) {
                 filtered.add(laptop.ram);
                 }
                break;
            case (4):
            for (Laptop laptop : listLaptops) {
                filtered.add(laptop.hd);
                 }
                break;
            case (5):
            for (Laptop laptop : listLaptops) {
                filtered.add(laptop.processor);
                        
                }
                break;
            default:
                filtered.add(null);;
                break;
        }
        return filtered;
    }

}
