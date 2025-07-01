package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode_TwoSums {

    public static int[] twoSums(int[]nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliments = target-nums[i] ;
            if(map.containsKey(compliments)){
                return new int[]{i,map.get(compliments)};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[]nums = {2,3,4,9};
      int target = scanner.nextInt();

        System.out.println(twoSums(nums,target));
    }
}
