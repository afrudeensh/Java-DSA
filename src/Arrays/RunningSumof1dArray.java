package Arrays;
import java.util.*;
public class RunningSumof1dArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        int runningSums[]= new int[nums.length];
        runningSums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
           runningSums[i] = runningSums[i-1]+nums[i];

        }
        System.out.println("Running Sum array: " + Arrays.toString(runningSums));
    }
}
