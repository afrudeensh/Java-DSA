package Map;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyAndValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);

        System.out.println(map.containsKey("Rama"));//gives boolean
        System.out.println(map.containsValue(2));//boolean
        System.out.println(map.containsValue(23));
    }
}
