import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args){
        int[] arr = {11, 13, 7, 9, 10, 5, 8, 90, -100};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r){
        if(l >= r) return;
        int pivotIndex = partition(arr, l, r);
        quickSort(arr, l, pivotIndex-1);
        quickSort(arr, pivotIndex+1, r);
    }

    private static int partition(int[] arr, int l, int r){
        int last = r;
        // Always choose the last element in the array as the pivot
        int pivot = arr[r];
        r--;
        while(l <= r){
            if(arr[l] < pivot){
                l++;
            }else{
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
        }
        int temp2 = arr[l];
        arr[l] = pivot;
        arr[last] = temp2;
        return l;
    }
}