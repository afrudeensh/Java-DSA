package Arrays;

public class RemovingEvenIntegers {
    public static void main(String[] args) {
        int[] num = {3,2,4,7,10,6,5};
        System.out.print("Before removing even elements ");
        for (int a = 0; a < num.length; a++) {
            System.out.print(num[a]+" ");
        }
        System.out.print("\nAfter removing even elements ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i]+" ");
            }
        }
    }
}
