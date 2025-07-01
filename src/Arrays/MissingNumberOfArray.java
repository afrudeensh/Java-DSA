package Arrays;

public class MissingNumberOfArray {
    public static void main(String[] args) {
        int[]num={1,2,3,4,6,7,8};
        System.out.println(missingValue(num));
    }
    public static int missingValue(int[]arr){
        int n = arr.length+1;
        int sum =(n*(n+1)/2);
        for(int no:arr){
            sum = sum-no;
        }
        return sum;
    }
}
