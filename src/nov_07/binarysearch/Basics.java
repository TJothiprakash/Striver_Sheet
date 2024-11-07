package nov_07.binarysearch;

public class Basics {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tarrget = 8;
        int ans = binarySearch(arr, tarrget);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int tarrget) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tarrget) {
                return mid;
            } else if (arr[mid] > tarrget) {
                high = mid - 1;

            } else if (arr[mid] < tarrget) {
                low = mid + 1;
            }

        }

        return -1;
    }

}


