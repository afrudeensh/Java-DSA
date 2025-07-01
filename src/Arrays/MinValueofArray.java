package Arrays;
import java.util.Arrays;

public class MinValueofArray {

    public static int minimum(int arr[],int min){
        Arrays.sort(arr);
        min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min<arr[i]){
                arr[i]=min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={4,6,3,1,7,10,11};
        int min =0;
        MinValueofArray ma = new MinValueofArray();
        System.out.println(ma.minimum(arr,min));
    }
}
