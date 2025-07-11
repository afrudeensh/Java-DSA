package Map;

import java.util.HashMap;
import java.util.Map;

public class GetMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);
        System.out.println("Getting the map: "+map.get("Rama"));
        System.out.println("Getting the map: "+map.get("sITA"));//NULL- HASHMAP CNA HAVE 1 KEY AS NULL, AND MULTIPLE VALUES AS NULL
        System.out.println("Getting the map: "+map.get("Sita"));

    }
}
