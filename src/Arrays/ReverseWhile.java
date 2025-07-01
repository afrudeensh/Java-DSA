package Arrays;

public class ReverseWhile {

    public static void reverse(int []nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int []nums){
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7};
        int start =0;
        int end = (nums.length)-1;
        printArray(nums);
        reverse(nums,start,end);
        printArray(nums);
    }
}
