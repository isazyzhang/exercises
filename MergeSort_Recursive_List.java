import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MergeSort_Recursive_List {
    public static void main(String[] args){
        List<Integer> lst = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println(mergeSort(lst, 0, lst.size()-1));
    }

    private static List<Integer> mergeSort(List<Integer> lst, int left, int right){
        List<Integer> res = new ArrayList<>();
        if(left == right){
            res.add(lst.get(left));
            return res;
        }
        int mid = left + (right - left) / 2;
        List<Integer> leftRes = mergeSort(lst, left, mid);
        List<Integer> rightRes = mergeSort(lst, mid+1, right);
        return merge(leftRes, rightRes);
    }

    private static List<Integer> merge(List<Integer> a, List<Integer> b){
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.size() && j < b.size()){
            if(a.get(i) < b.get(j)){
                merged.add(a.get(i));
                i++;
            }else{
                merged.add(b.get(j));
                j++;
            }
        }

        while(i < a.size()){
            merged.add(a.get(i));
            i++;
        }

        while(j < b.size()){
            merged.add(b.get(j));
            j++;
        }

        return merged;
    }
}