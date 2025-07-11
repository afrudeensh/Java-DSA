package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);
        map.put("Hanuman",3);

        Set<String>key = map.keySet();
        for(String ky:key){
            System.out.println(key);
        }
    }
}
