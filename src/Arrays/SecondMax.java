package Arrays;

public class SecondMax {
    public static int secondValue(int[]arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            } else if (num>secondMax && num!=max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,50,6};
        int maximum = secondValue(arr);
        System.out.println(maximum);
    }
}
