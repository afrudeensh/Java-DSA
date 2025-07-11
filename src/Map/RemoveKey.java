package Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);
        int rmv = map.remove("Sita");
        System.out.println("removing the key: "+rmv);
    }
}
