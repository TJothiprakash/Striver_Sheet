package nov_06;

public class MaxCountOf1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));

    }

    private static int maxConsecutiveOnes(int[] arr) {
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else {
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
}
