package Strings;

import java.math.BigInteger;
import java.util.*;

public class AddToArrayFormEasy {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        // Convert the array-form number to a string
        StringBuilder sb = new StringBuilder();
        for (int digit : num) {
            sb.append(digit);
        }

        // Convert string and k to BigInteger
        BigInteger number = new BigInteger(sb.toString());
        BigInteger result = number.add(BigInteger.valueOf(k));

        // Convert result to list of digits
        List<Integer> output = new ArrayList<>();
        for (char ch : result.toString().toCharArray()) {
            output.add(ch - '0');
        }

        return output;
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 4};
        int k = 181;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }
}
