package Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int []nums ={0,0,1,1,1,2,2,3,3,4};
        removingDuplicateElements(nums);
    }
    public static void removingDuplicateElements(int []nums){
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        System.out.println("Removing the duplicate Elements "+(j+1));
    }
}
