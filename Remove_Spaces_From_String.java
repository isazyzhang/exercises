public class Remove_Spaces_From_String {
    public static void main(String[] args){
        System.out.println(removeSpaces("      Haha     yes maybe "));
    }

    public static String removeSpaces(String s){
        int i = 0;
        int j = 0;
        String res = "";
        char[] l = s.toCharArray();
        int wordCount = 0;

        while(true){
            while(j < l.length && l[j] == ' '){
                j++;
            }

            if(j == l.length) break;

            if(wordCount > 0){
                l[i++]=' ';
            }

            while(j < l.length && l[j] != ' '){
                l[i++] = l[j++]; 
            }
            wordCount++;
        }

        for(int k = 0; k < i; k++){
            res += l[k];
        }
        return res;
    }
}