package nov_05;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 3, 1};
        System.out.println("Before merge sort");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
       Sort(arr);
        System.out.println("After merge sort :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void Sort(int[] arr) {
         mergeSort( arr,0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low >=high) return ;
        int mid = (low+high)/2;
        mergeSort(arr,low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low, mid, high);

    }
    private static  void merge(int[] arr, int low, int mid, int high) {
        ArrayList list = new ArrayList();

        int left = low;
        int right=mid+1;

        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else {
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
       // System.out.println(list);
        for(int i=low;i<=high;i++){
            arr[i] = (int) list.get(i-low);
        }

    }
}
