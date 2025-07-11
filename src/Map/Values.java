package Map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Values {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rama",1);
        map.put("Sita",2);
        map.put("Hanuman",3);
        Collection<Integer> values = map.values();
        for(Integer val: values){
            System.out.println(val);
        }
    }
}
