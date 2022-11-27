package HomeworkPhoneBook;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");
        
        List <String> strings= new LinkedList<>();
        strings = phoneBook.getArr("Philipp", phoneBook);
        
        System.out.println(strings);
        }
}
