package nov_05;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};

        int ans = reversePairs(arr);
        System.out.println(ans);
    }

    private static int reversePairs(int[] a) {
        int cnt = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > 2 * a[j])
                    cnt++;
            }
        }
        return cnt;

    }
}
