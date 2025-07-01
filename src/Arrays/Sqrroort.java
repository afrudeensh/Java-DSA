package Arrays;

public class Sqrroort {
    public static void main(String[] args) {
        Integer[] num = {16, 1, 0, 9, 100};
        int[] sqrtnum = new int[num.length];

        for (int i = 0; i < sqrtnum.length; i++) {
            sqrtnum[i] = sqrtnum[i] * sqrtnum[i];
            System.out.println(sqrtnum[i]);
        }

    }
}
