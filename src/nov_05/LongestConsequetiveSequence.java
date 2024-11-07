package nov_05;

import java.util.Arrays;

public class LongestConsequetiveSequence {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(longestConsecutive(arr));

    }

    private static int longestConsecutive(int[] arr) {
        int count = 1;
        int max = 1;
        Arrays.sort(arr);
        if (arr.length <= 1) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        return Math.max(count, max);
    }
}
