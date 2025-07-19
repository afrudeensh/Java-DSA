package SinglyLinkedList;
import java.util.*;
import java.util.LinkedList;

public class NameLinkedList {
    public static void main(String[] args) {
        List<String>names = new LinkedList<>();
        names.add("Roy");
        names.add("Joy");
        names.add("Binoy");
        names.add("Bejoy");
        System.out.println(names);
        names.add("Bejoy");
        names.add(5,"Peter");//adding at the specific index
        names.addFirst("Lava");//adding at the beginning
        names.addLast("Kush");//adding at the last

        String firstElement= names.getFirst();//get first element
        String lastElement= names.getLast();//get last element

        String getElement = names.get(5);
        System.out.println(names);
        Map<String,Integer>nameMap = new HashMap<>();
        for(String map : names){
            nameMap.put(map,nameMap.getOrDefault(map,0)+1);
        }
        for(Map.Entry<String,Integer>occuranceMap:nameMap.entrySet()){
            System.out.println(occuranceMap.getKey()+" ==> "+occuranceMap.getValue());
        }
        System.out.println(firstElement);
        System.out.println(lastElement);
        System.out.println(getElement);
        System.out.println(names.reversed());
    }
}
