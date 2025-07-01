package Arrays;

public class ProductOfTwo9ElementsArray {
    public static int secondValue(int[]arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondMax = max;
                max=num;
            } else if (num>secondMax && num!=max) {
                secondMax = num;
            }
        }
        int ans = (max-1)*(secondMax-1);
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,50,6};
        int maximum = secondValue(arr);
        System.out.println(maximum);
    }
}
