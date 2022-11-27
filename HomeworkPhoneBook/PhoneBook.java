package HomeworkPhoneBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    public void add(String name , String number) {
        // TODO: 21.11.2022 Реализовать
        Map <String, String> map= new HashMap<>();
        map.put(name, number);

    }
        
    public List<String> getArr(String name, Map <String, String> map) {
        // TODO: 21.11.2022 Реализовать получение всех номеров по фамилии
        List <String> phone= new LinkedList<>();
        for (String key: map.keySet()){
            if (map.containsKey(name)==true){
                String f=map.get(key);
                phone.add(f);
                
            }
        }
        return phone;
    }
        
}

