package nov_07.binarysearch;

class tUf {
    // Return 1 if mid^n == m
    // Return 0 if mid^n < m
    // Return 2 if mid^n > m
    public static int func(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) return 2; // No need to continue if the result exceeds m
        }
        if (ans == m) return 1;
        return 0;
    }

    public static int NthRoot(int n, int m) {
        // Use binary search on the answer space:
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midN = func(mid, n, m);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 64;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans); // Expected output: 4
    }
}
