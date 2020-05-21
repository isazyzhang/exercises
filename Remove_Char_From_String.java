import java.util.Arrays;

public class Remove_Char_From_String {
    public static void main(String[] args){
        System.out.println(removeChar("stduunt"));
    }

    public static String removeChar(String s){
        String res = "";
        int i = 0;
        int j = 0;
        char[] arr = s.toCharArray();
        int size = arr.length;
        while(j < size){
            if(arr[j] == 'n' || arr[j] == 'u'){
                j++;
            } else {
                arr[i] = arr[j];
                i++;
                j++;
            }
        }

        for(int k = 0; k < i; k++){
            res += arr[k];
        }

        return res;
    }
}