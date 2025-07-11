package Map;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);
        map.put("Hanuman",3);

        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry.getValue()+" => "+entry.getKey());
        }
    }
}
