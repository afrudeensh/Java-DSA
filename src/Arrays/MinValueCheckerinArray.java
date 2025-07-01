package Arrays;

public class MinValueCheckerinArray {

    public static int minValue(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int num:arr){
            if(num < min){
                min =num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[]arr ={10,23,3,41,5,62,71,8,9};
        int min = minValue(arr);
        System.out.println("Minimum value in Array:"+min);
    }
}
