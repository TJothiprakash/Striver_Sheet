package nov_05;

public class XorOfSubArrays {
    public static void main(String[] args) {
    int []arr= {4, 2, 2, 6, 4};
    int k=6;
        System.out.println(xor(arr,k));

    }

    private static int xor(int[] arr,int k) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                int xoor=0;
                for (int  K= i; K <=j ; K++) {
                    xoor=xoor^arr[K];
                }
                if(xoor==k)count++;
            }
        }
        return count;
    }

}
