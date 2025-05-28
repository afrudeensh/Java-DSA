package Arrays;

public class RemovingEvenIntegers {
    public static void main(String[] args) {
        int[] num = {1, 20, 30, 40, 5, 60};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }

    }
}
