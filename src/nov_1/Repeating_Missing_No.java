package nov_1;

public class Repeating_Missing_No {
    public static void main(String[] args) {
        int []test= {1,1,2,3,4,5,6,8};
        //int []ans=findnumbers(test);
        int []ans= updateHashArray(test);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static int[] findnumbers(int[] nums) {
        int n = nums.length;
        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }

            if (repeating != -1 && missing != -1) {
                break;
            }


        }
        int [] ans={repeating,missing};
        return ans;
    }
    private  static int[] updateHashArray(int nums[]){
        int n= nums.length;
        int []hashArray= new int[n+1];

        for (int i = 0; i < n; i++) {
            hashArray[nums[i]]++;
        }
            int repeating =-1,missing=-1;
        for (int i = 1; i <= n; i++) {
            if(hashArray[i]==0){
                missing=i;
            }else if(hashArray[i]==2){
                repeating=i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }

        }
        int[]ans= new int[]{repeating,missing};
        return ans;
    }
}