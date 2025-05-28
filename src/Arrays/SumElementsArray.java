package Arrays;

public class SumElementsArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = {1, 20, 30, 40, 5, 60};
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Sum of Elements in Array" + sum);
        int l = num.length;
        int n = sum / l;
        System.out.println(n);
    }
}
