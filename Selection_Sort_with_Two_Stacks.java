import java.util.Stack;
public class Selection_Sort_with_Two_Arrays {

    public static void main(String[] args){
        Stack<Integer> arr = new Stack<Integer>();
        arr.push(7);
        arr.push(-4);
        arr.push(1);
        arr.push(0);
        System.out.println(arr);
        // arr: [7, -4, 1, 0], want to sort it to: [-4, 0, 1, 7]

        Stack<Integer> helper = new Stack<Integer>();
        Stack<Integer> sorted = new Stack<Integer>();
        int num_iterations = arr.size();
        for(int i = 0; i < num_iterations; i++){
            int globalMin = arr.peek();
            while(!arr.isEmpty()){
                int cur_arr = arr.pop();
                helper.push(cur_arr);
                if(cur_arr < globalMin){
                    globalMin = cur_arr;
                }
            }
    
            while(!helper.isEmpty()){
                int cur_helper = helper.pop();
                if(cur_helper == globalMin){
                    sorted.push(cur_helper);
                }else{
                    arr.push(cur_helper);
                }
            }
        }
        System.out.println(sorted);
    }
}