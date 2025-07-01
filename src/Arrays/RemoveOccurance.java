package Arrays;

import java.util.*;

public class RemoveOccurance {

    public static int removeOccurance(int[]nums,int val){
//        List<Integer>array = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                array.add(nums[i]);
//            }
//        }
//        int len = array.size();
//        return len;
        int ptr =0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
    public static void main(String[] args) {
        int[]nums = {3,2,2,3};
        int val = 3;
        int result = removeOccurance(nums,val);
        System.out.println("Size of Occurance: "+result);

    }
}
