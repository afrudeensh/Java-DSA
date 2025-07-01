package Arrays;

public class Max {
    public static int findMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 1, 70, 10, 11};
        int max = findMaximum(arr);
        System.out.println("Maximum value: " + max);
    }
}
