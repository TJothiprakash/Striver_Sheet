package nov_07.binarysearch;

import java.util.ArrayList;
import java.util.List;

public class MatrixMedian
{
    public static void main(String[] args) {
        int[][] arr = {{1, 532, 3}};
        int ans = matrixMedian(arr);
        System.out.println(ans);
    }

    private static int matrixMedian(int[][] arr) {
        int row = arr.length;
        int column=arr[0].length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                list.add(arr[i][j]);
            }

        }
        list.sort(Integer::compareTo);
        System.out.println(list);
        return list.get(row*column/2);
    }

}
