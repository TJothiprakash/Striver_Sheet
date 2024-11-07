package nov_05;

public class InversionOfArray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int ans = inversionOfArray(arr);
        System.out.println(ans);
    }

    private static int inversionOfArray(int[] arr) {

        int[] ans = new int[arr.length];
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(i<j && arr[i]>arr[j]){
                    count++;

                }
            }

        }
        return count;
    }
}
