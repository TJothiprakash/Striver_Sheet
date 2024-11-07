package nov_1;

import java.util.Arrays;

public class DuplicateIdentification {
    /*Input: arr=[1,3,4,2,2]

Output: 2

Explanation: Since 2 is the duplicate number the answer will be 2.

Example 2:

Input: [3,1,3,4,2]

Output:3

Explanation: Since 3 is the duplicate number the answer will be 3.*/
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        int ans=findDuplicate(arr);
        System.out.println(ans);

    }

    private static int findDuplicate(int[] arr) {
        int ans=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arr[i+1]){
                ans=arr[i];
                break;
            }
        }

        return ans;
    }
}
