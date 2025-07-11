package Map;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("c");
        list.add("a");
        list.add("e");

        Map<String,Integer> countMap = new HashMap<>();
        for(String cn :list){
            countMap.put(cn,countMap.getOrDefault(cn,0)+1);
        }

        for(Map.Entry<String,Integer>entry: countMap.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

    }
}
