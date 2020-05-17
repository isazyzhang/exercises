import java.util.Arrays;
public class MergeSort_Recursive {

    public static void main(String[] args){
        int[] arr = new int[]{1,3,5,7,9,2,4,6,8,10};
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] mergeSort(int[] arr){
        int len = arr.length;
        if(len <= 1) return arr;
        int[] left = new int[len/2];
        int[] right = new int[len - left.length];
        for(int i = 0; i < left.length; i++){
            left[i] = arr[i];
            right[i] = arr[i+left.length];
        }
        if(right.length > left.length) right[right.length-1] = arr[len-1];

        int[] leftRes = mergeSort(left);
        int[] rightRes = mergeSort(right);

        return merge(leftRes, rightRes);
    }

    private static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int i, j, k;
        i = j = k = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i++];
            }else{
                c[k] = b[j++];
            }
            k++;
        }
        while(i < a.length){
            c[k++] = a[i++];
        }
        while(j < b.length){
            c[k++] = b[j++];
        }
        return c;
    }
    
}