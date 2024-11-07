package nov_06;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesinSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 7};
        int[] ans = removeDuplicateOptimalApproach(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int[] ans = new int[set.size()];
        int j = 0;
        for (int i : set) {
            ans[j++] = i;
        }
        return ans;
    }

    private static int[] removeDuplicateOptimalApproach(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                for (int j = i + 1; j < arr.length - 1; j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                i--;
            }

        }
        return arr;
    }

}

/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
       int arr[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}

*/