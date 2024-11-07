package nov_06;

import java.util.Arrays;

public class PlatformsNeeded {
    public static void main(String[] args) {
        int[] arr ={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=arr.length;
        int totalCount=findPlatform(arr,dep,n);
        System.out.println("Minimum number of Platforms required "+totalCount);

    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int count=1;
        int maxCount=Integer.MIN_VALUE;
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1,j=0;
        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                count++;
                i++;
            }

            else if (arr[i] > dep[j]) {
                count--;
                j++;
            }

            if (count > maxCount)
                maxCount = count;
        }

        return maxCount;
    }

}
