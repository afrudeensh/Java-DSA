package Arrays;
import java.util.*;
public class CollectionArrayAscendingDescendingt {
    public static void main(String[] args) {
        Integer[]num = {16,1,0,9,100};
        Arrays.sort(num);
        System.out.println("Ascending Order:");
        for(int asc:num){
            System.out.print(asc +" ");
        }
        System.out.println("\nDescending Order:");
        Arrays.sort(num,Collections.reverseOrder());
        for(int desc:num){
            System.out.print(desc +" ");
        }

    }
}
