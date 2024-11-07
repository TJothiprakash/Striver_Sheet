package nov_07;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = permute(arr);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(arr, 0, ans);
        return ans;
    }

    private static void permuteHelper(int[] arr, int i, List<List<Integer>> ans) {
        if (i == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                temp.add(arr[j]);
            }
            ans.add(temp);
            return;
        }
        for (int j = i; j < arr.length; j++) {
            swap(arr, i, j);
            permuteHelper(arr, i + 1, ans);
            swap(arr, i, j);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
